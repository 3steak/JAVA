import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ArticleDAO {
    private Connection connection;

    // Constructor

    public ArticleDAO(Connection connection) {
        this.connection = connection;
    }

    // Méthode pour obtenir la liste des articles
    public List<Article> getAllArticles() throws SQLException {
        List<Article> articles = new ArrayList<>();
        // Écrire la requête SQL pour récupérer les articles et les ajouter à la liste
        
        String query = "SELECT * FROM article";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                double price = resultSet.getDouble("price");
                int stock = resultSet.getInt("stock");

                Article article = new Article(id, name, price, stock);
                articles.add(article);
            }
        }

        return articles;
    }

    // Méthode pour mettre à jour le stock d'un article après l'achat
    public boolean updateStock(int articleId, int quantity) throws SQLException {
        String query = "UPDATE article SET stock = stock - ? WHERE id = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, quantity);
            preparedStatement.setInt(2, articleId);

            int rowsAffected = preparedStatement.executeUpdate();

            // Si au moins une ligne a été modifiée, la mise à jour a réussi
            return rowsAffected > 0;
        }
    }
}

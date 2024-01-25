package com.mycompany.app;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ArticleDAO {
    private Connection connection;

    public ArticleDAO(Connection connection) {
        this.connection = connection;
    }

    public List<Article> getAllArticles() throws SQLException {
        List<Article> articles = new ArrayList<>();

        String query = "SELECT * FROM articles";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                int id_article = resultSet.getInt("id_article");
                String libelle = resultSet.getString("libelle");
                double prix = resultSet.getDouble("prix");
                int stock = resultSet.getInt("stock");

                Article article = new Article(id_article, libelle, prix, stock);
                articles.add(article);
            }
        }

        return articles;
    }

    public boolean updateStock(int articleId, int quantity) throws SQLException {
        String query = "UPDATE articles SET stock = stock - ? WHERE id_article = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, quantity);
            preparedStatement.setInt(2, articleId);

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        }
    }
}

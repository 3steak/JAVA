import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:6033/achat", "root", "my_secret_password");

            ArticleDAO articleDAO = new ArticleDAO(connection);
            ArticleService articleService = new ArticleService(articleDAO);

            Scanner scanner = new Scanner(System.in);

            // Afficher la liste des articles
            articleService.displayArticles();

            // Demander la saisie d'un article et d'une quantité
            System.out.print("Sélectionnez un article par son identifiant : ");
            int articleId = scanner.nextInt();

            System.out.print("Saisissez la quantité : ");
            int quantity = scanner.nextInt();

            // Effectuer l'achat
            articleService.purchaseArticle(articleId, quantity);

            // Fermer les ressources
            connection.close();
            scanner.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}

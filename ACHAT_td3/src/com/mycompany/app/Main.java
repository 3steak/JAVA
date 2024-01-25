package com.mycompany.app;
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
            ArticleService articleService = new ArticleService(articleDAO, connection);

            Scanner scanner = new Scanner(System.in);

            articleService.displayArticles();

            System.out.print("Sélectionnez un article par son identifiant : ");
            int articleId = scanner.nextInt();

            System.out.print("Saisissez la quantité : ");
            int quantity = scanner.nextInt();

            articleService.purchaseArticle(articleId, quantity);
            articleService.displayArticles();

            connection.close();
            scanner.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}

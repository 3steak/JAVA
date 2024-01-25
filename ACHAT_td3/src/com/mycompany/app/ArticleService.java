package com.mycompany.app;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ArticleService {
    private ArticleDAO articleDAO;
    private Connection connection;

    public ArticleService(ArticleDAO articleDAO, Connection connection) {
        this.connection = connection;
        this.articleDAO = articleDAO;
    }

    public void displayArticles() {
        try {
            List<Article> articles = articleDAO.getAllArticles();
            for (Article article : articles) {
                System.out.println("ID: " + article.getId() + ", Name: " + article.getName() + ", Stock: " + article.getStock());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void purchaseArticle(int articleId, int quantity) {
        try {
            boolean purchaseSuccessful = articleDAO.updateStock(articleId, quantity);

            if (purchaseSuccessful) {
                System.out.println("Achat réussi. Prix total : " + getTotalPrice(articleId, quantity));
            } else {
                System.out.println("L'achat ne peut pas être effectué. Stock insuffisant.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private double getTotalPrice(int articleId, int quantity) throws SQLException {
    	  String query = "SELECT prix FROM articles WHERE id_article = ?";
          
          try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
              preparedStatement.setInt(1, articleId);

              try (ResultSet resultSet = preparedStatement.executeQuery()) {
                  if (resultSet.next()) {
                      double articlePrice = resultSet.getDouble("prix");
                      return articlePrice * quantity;
                  }
              }
          }
        return 0.0;
    }
}

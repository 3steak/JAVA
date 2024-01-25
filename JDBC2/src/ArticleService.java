import com.mycompany.app.dao.ArticleDAO;
import com.mycompany.app.model.Article;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class ArticleService {
    private ArticleDAO articleDAO;

    // Constructor

    public ArticleService(ArticleDAO articleDAO) {
        this.articleDAO = articleDAO;
    }

    // Méthode pour afficher la liste des articles avec leur identifiant et stock
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

    // Méthode pour effectuer l'achat d'un article
    public void purchaseArticle(int articleId, int quantity) {
        try {
            // Vérifier si l'achat est possible en fonction du stock
            // Si possible, afficher le prix total, mettre à jour le stock et afficher un message de succès
            // Sinon, afficher un message d'échec
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:6033/app_db", "root", "my_secret_password");

            connection.setAutoCommit(false);

            boolean randomCondition = new Random().nextBoolean();

            try {
                PreparedStatement updateAverageStmt = connection.prepareStatement("UPDATE student SET average = average + 1 WHERE email LIKE '%@gmail.com%'");
                int rowsUpdated = updateAverageStmt.executeUpdate();

                System.out.println("Nombre d'étudiants avec compte GMAIL dont la moyenne a été mise à jour : " + rowsUpdated);

                if (!randomCondition) {
                    throw new SQLException("Simulation d'une erreur aléatoire.");
                }

                connection.commit();
                System.out.println("Transaction commitée avec succès.");
            } catch (SQLException e) {
                // En cas d'erreur, rollback de la transaction
                System.out.println("Erreur pendant la transaction. Rollback en cours.");
                connection.rollback();
                e.printStackTrace();
            } finally {
                connection.setAutoCommit(true);

                connection.close();
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}

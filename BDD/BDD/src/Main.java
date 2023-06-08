import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Connection;

public class Main {

    public static void main(String[] args) {
        String url = "jdbc:sqlite:D://Code/JAVA/FormationVideo/JAVA/BDD/BDD/src/base.db";

        String sql = """
                UPDATE students SET name =?
                WHERE name =? """;

        try {
            Connection co = DriverManager.getConnection(url);

            // prepareStatement
            PreparedStatement stmt = co.prepareStatement(sql);

            // setString me permet de remplacer =?
            // donc 1 Delphes par 2 Lolo

            stmt.setString(1, "Lolo");
            stmt.setString(2, "Delphes");

            int result = stmt.executeUpdate();
            if (result == 1) {
                System.out.println("Mis à jour ok");
            } else {
                System.out.println("Non mis à jour");
            }
            co.close();

        } catch (SQLException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
}

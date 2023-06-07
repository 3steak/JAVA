import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class Main {

    public static void main(String[] args) {
        String url = "jdbc:sqlite:D://Code/JAVA/FormationVideo/JAVA/BDD/BDD/src/base.db";

        String sql = """
                SELECT * FROM students """;

        try {
            Connection co = DriverManager.getConnection(url);
            Statement stmt = co.createStatement();
            ResultSet result = stmt.executeQuery(sql);

            while (result.next()) {
                String name = result.getString("name");
                System.out.println(name);

            }

        } catch (SQLException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) {

        // recupération du chemin du fichier
        Path file = Paths.get("infos.txt");

        try {

            BufferedWriter bufferedWriter = Files.newBufferedWriter(file);
            String s = "Merci !";
            bufferedWriter.write(s);
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("IOException :" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception :" + e.getMessage());
        }
    }
}

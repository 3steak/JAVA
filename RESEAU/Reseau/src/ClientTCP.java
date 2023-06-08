import java.net.Socket;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;

public class ClientTCP {
    public static void main(String[] args) throws IOException {
        try {

            // initialise socketClient
            Socket clientSocket = new Socket("localhost", 8585);

            // reception des données
            BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            // Ecriture des données
            PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);

            // j'écris la donnée

            writer.println("Salut les nazes c'est le client");
            // je lis la donnée
            System.out.println(reader.readLine());

            clientSocket.close();
            reader.close();
            writer.close();

        } catch (Exception e) {
            System.err.println("[ERREUR]" + e);
        }

    }
}

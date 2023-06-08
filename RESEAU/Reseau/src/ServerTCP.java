import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTCP {
    public static void main(String[] args) throws IOException {
        try {
            // Socket serveur
            ServerSocket serverSocket = new ServerSocket(8585);
            System.out.println("Serveur en attente...");

            // Socket client
            Socket clientSocket = serverSocket.accept();
            System.out.println("Connexion établie avec le client");

            // reception des données
            BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            // Ecriture des données
            PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);

            System.out.println(reader.readLine());
            writer.println("Message bien recu!");

            reader.close();
            writer.close();
            // fermer le socket
            clientSocket.close();
            clientSocket.close();
        } catch (Exception e) {

            System.err.println("[ERREUR]" + e);
        }

    }
}

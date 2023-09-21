package Server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {

		int port = 12345; // port sur lequel le serveur écoute

		try {
			ServerSocket serverSocket = new ServerSocket(port);
			System.out.println("Le serveur est en attente de connexions...");

			// Attendre une connexion du client
			Socket clientSocket = serverSocket.accept();
			System.out.println("Connexion établie avec le client.");

			// creer des flux de communication avec le client
			BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

			// lire les messages du client et y repondre
			String message;
			while ((message = in.readLine()) != null) {
				System.out.println("Client : " + message);
				out.println("Serveur : Message reçu : " + message);
			}
			
			//Fermer les flux et les sockets
			in.close();
			out.close();
			clientSocket.close();
			serverSocket.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		// end class
	}

}

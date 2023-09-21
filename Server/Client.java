package Server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String serverAdress = "localhost";
		int serverPort = 12345;
		
		try {
			// connexion avec server
			Socket socket = new Socket(serverAdress, serverPort);
			
			// creation flux 
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter out= new PrintWriter(socket.getOutputStream(),true);
			
			// Envoyer des messages au serveur
			out.println("Bonjour, serveur");
			out.println("Comment ça va ? ");
			out.println("Au revoir, serveur");
			
			// lire les reponses du serveur
			
			String response;
			while((response = in.readLine()) != null) {
				System.out.println(response);
			}

			// Fermer les flux 
			in.close();
			out.close();
			socket.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}

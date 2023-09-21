package UDPClient;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DatagramSocket socket = null;

		try {

			// créer une socket UDP
			socket = new DatagramSocket();

			String message = "Bonjour, serveur UDP !";
			byte[] sendData = message.getBytes();

			InetAddress serverAdress = InetAddress.getByName("localhost");
			int serverPort = 9876;

			// Créer un paquet UDP à envoyer au serveur
			DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAdress, serverPort);

			// Envoyer le paquet
			socket.send(sendPacket);

			// Attendre une reponse
			byte[] receiveData = new byte[1024];
			DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
			socket.receive(receivePacket);

			// Extraire et aficher la reponse du serveur
			String replyMessage = new String(receivePacket.getData(), 0, receivePacket.getLength());
			System.out.println("Reponse du serveur : " + replyMessage);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (socket != null && !socket.isClosed()) {
				socket.close();
			}
		}

// end class
	}

}

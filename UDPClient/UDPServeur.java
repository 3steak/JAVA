package UDPClient;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServeur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DatagramSocket socket = null;
		try {
			// Créer une socket UDP sur le port 9876
			socket = new DatagramSocket(9876);

			byte[] receiveData = new byte[1024];

			while (true) {
				// Attendre la réception d'un paquet UDP
				DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
				socket.receive(receivePacket);

				// Extraire les données du paquet
				String message = new String(receivePacket.getData(), 0, receivePacket.getLength());
				System.out.println("Message reçu du client : " + message);

				// repondre au client
				InetAddress clientAdress = receivePacket.getAddress();
				int clientPort = receivePacket.getPort();
				String replyMessage = "Message reçu avec succès !";
				byte[] sendData = replyMessage.getBytes();
				DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, clientAdress, clientPort);

			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();

		} finally {
			if (socket != null && !socket.isClosed()) {
				socket.close();
			}
		}

		// en main
	}

}

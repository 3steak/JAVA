package queue;

import java.util.LinkedList;
import java.util.Queue;

public class InitQueue {

	public static void main(String[] args) throws InterruptedException {
		// Creation d'une file d'attente (queue) en utilisant LinkedList
		
		Queue<String> queue = new LinkedList<>();
		
		// Enfilez des élements dans la file d'attente
		queue.offer("Client 1");
		queue.offer("Client 2");
		queue.offer("Client 3");

		// Afficher la file d'attente
		System.out.println("File d'attente initiale: "+ queue);
        Thread.sleep(2000);

		// Défiez les élements (retirer la tête de la file)
		String clientServi = queue.poll();
		System.out.println(clientServi + " est servi.");
        Thread.sleep(2000);

		// Afficher la file d'attente après le service
		System.out.println("File apres le service"+ queue);
        Thread.sleep(2000);

		// accéder a l'élement en tête de la file sans le retirer
		String prochainClient = queue.peek();
		System.out.println("Prochain client en attente:"+ prochainClient);
		
		// End class
	}

}

package Threads;

public class InitThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread1 = new Thread(new MonRunnable("Thread 1"));
		thread1.start();

		// créer et demarre un autre thread

		Thread thread2 = new Thread(new MonRunnable("Thread 2"));
		thread2.start();

		// attend que les deux threads se terminent
		try {
			thread1.join();
			thread2.join();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Le thread principal a été interomppu");
		}

		// affiche un message lorsque les threads ont terminé
		System.out.println("Les threads ont terminé leurs éxécution");
//End main
	}
}

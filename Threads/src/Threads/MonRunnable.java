package Threads;

public class MonRunnable implements Runnable {
	private String name;

	MonRunnable(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(name + ": Etape "+ i);
			try {
				// faite dormir le thread pendant un certain 
			Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(name + "a été interrompu");
			}
		}
	}
}

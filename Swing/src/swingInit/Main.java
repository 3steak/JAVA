package swingInit;

import javax.swing.SwingUtilities;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//créer et excécute l'application Swing sur le thread de l'interface utilisateur
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				//créer une instance de guessinggamelogic
				GuessingGame game= new GuessingGameLogic();
				game.startGame();
			}
		});
	}

}

package swingInit;

import java.util.Random;

import javax.swing.JOptionPane;

public class GuessingGameLogic implements GuessingGame {

	private int randomNumber; 
	private int attempts = 0;
	private final int maxAttempts = 5;
	
	//Constructeur
	
	public GuessingGameLogic(){
		Random rand = new Random();
		randomNumber = rand.nextInt(6); 
	}
	
	public void startGame() {
		GameUi ui = new GameUi(this);
		ui.createUI();
	}
	public void checkGuess(int guess) {
		attempts++; // Incrémente le nombre d'essai effectués
		
		if(guess==randomNumber) {
			JOptionPane.showMessageDialog(null, "Bravo ! vous avez deviné le nombre !");
			System.exit(0);
		}else if (attempts >= maxAttempts) {
			JOptionPane.showConfirmDialog(null, "Vous avez atteint le nombre maximal d'essai");
		}else if(guess<randomNumber) {
			JOptionPane.showConfirmDialog(null, "Trop bas. Essayez encore une fois");
		}else {
			JOptionPane.showConfirmDialog(null, "Trop élevé. Essayez encore.");
		}
	}
}

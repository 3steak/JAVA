package swingInit;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GameUi {

	private GuessingGame game;

	public GameUi(GuessingGame game) {
		this.game = game;
	}

	public void createUI() {
		// créer une fenetre swing avec le titre "Devinez le nombre"
		JFrame frame = new JFrame();
		frame.setTitle("Devinez le nombre");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 100);
			
		
		frame.setLayout(new FlowLayout()); // utilise un gestionnaire de disposition

		// creer une étiquette label pour afficher un message
		JLabel label = new JLabel("Devinez un nombre entre 0 et 5",JLabel.CENTER);
		JTextField textField = new JTextField(10);

		JButton guessButton = new JButton("Devinez");
		guessButton.setForeground(Color.ORANGE);
		guessButton.setBackground(Color.BLUE);

		JLabel resultLabel = new JLabel("");
		
		//FOND ECRAN

		guessButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					int guess = Integer.parseInt(textField.getText());
					game.checkGuess(guess);
				} catch (NumberFormatException ex) {
					// TODO: handle exception
					resultLabel.setText("Veuillez entrer un nombre valide");
				}
			}
		});

		// ajoute les compasants a la fenetre
		frame.add(label);
		frame.add(textField);
		frame.add(resultLabel);
		frame.add(guessButton);

		// Rend la fenetre visible
		frame.setVisible(true);
	}
}

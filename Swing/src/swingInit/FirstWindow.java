package swingInit;
import javax.swing.*;
public class FirstWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame frame = new JFrame("Ma première application Swing");
		
		//La taille de la fenetre
		
		frame.setSize(400,300);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("Bonjour, Swing !");
		
		frame.add(label);
		frame.setVisible(true);
	}
}

package swingInit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FirstJTextField {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame("Fenetre");
		f.setSize(300, 100);

		JPanel panel = new JPanel();

		JTextField textField1 = new JTextField("mon texte");
		panel.add(textField1);
		f.getContentPane().add(panel);
		f.setVisible(true);
	}
}

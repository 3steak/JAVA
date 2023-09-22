package swingInit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class FirstIcon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame f = new JFrame("ma fenetre");
		
		f.setSize(300,100);
		
		JButton b = new JButton("Mon bouton Je test les icon");
		
		f.getContentPane().add(b);
		
		f.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
		ImageIcon image = new ImageIcon("/swingInit/java.png");
		
		f.setIconImage(image.getImage());
		
		f.setVisible(true);
		
		
		
		
		//Fin class
	}

}

package swingInit;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class FirstCenter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame f = new JFrame("ma fenetre");
		
		f.setSize(500,200);
		
		JButton b = new JButton("mon button");
		
		f.getContentPane().add(b);
		f.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
		Dimension dim= Toolkit.getDefaultToolkit().getScreenSize();
		
		f.setLocation(dim.width/2 - f.getWidth()/2, dim.height/2 - f.getHeight()/2);
		
		f.setVisible(true);
	}

}

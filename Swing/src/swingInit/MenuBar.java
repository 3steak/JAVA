package swingInit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuBar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame f = new JFrame("ma fenetre");
		f.setSize(300, 100);

		JButton b = new JButton("Mon bouton");

		f.getContentPane().add(b);

		JMenuBar menuBar = new JMenuBar();

		f.setJMenuBar(menuBar);

		JMenu menu = new JMenu("Fichier");

		JMenuItem menuItem = new JMenuItem("Ouvrir");
		menu.add(menuItem);
		menuBar.add(menu);
		f.setVisible(true);
	}

}

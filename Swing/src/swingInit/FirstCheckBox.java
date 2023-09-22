package swingInit;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FirstCheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame f = new JFrame("ma fenetre");
		
		f.setSize(300, 400);
		
		
		JPanel panel = new JPanel();
		JCheckBox button1 = new JCheckBox("Button1");
		
		panel.add(button1);
		f.getContentPane().add(panel);
		f.setVisible(true);
		
		
		
		
		//END CLASS
	}

}

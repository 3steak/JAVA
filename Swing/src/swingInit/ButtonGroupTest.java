package swingInit;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class ButtonGroupTest {
	public static void main(String[] args) {
		JFrame f = new JFrame("ma fenetre");
		f.setSize(300, 500);

		JPanel panel = new JPanel();
		
		ButtonGroup group = new ButtonGroup();
		
		JRadioButton button1 = new JRadioButton("Boutton 1");
		group.add(button1);
		panel.add(button1);
		
		f.getContentPane().add(panel);
		
		f.setVisible(true);
		
		
		
		
		// endaclasss
	}
}

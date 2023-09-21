package ShiFuMi;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

public class PierreFeuilleCiseauxGUI extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int userLife = 3;
    private int machineLife = 3;
    
    
    private JLabel userLifeLabel;
    private JLabel machineLifeLabel;
    private JTextArea resultTextArea;

    // mon jeu
    public PierreFeuilleCiseauxGUI() {
        setTitle("Pierre Feuille Ciseau");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel topPanel = new JPanel();
        userLifeLabel = new JLabel("Vies restantes : " + userLife);
        machineLifeLabel = new JLabel("Vies de l'ordi : " + machineLife);
        topPanel.add(userLifeLabel);
        topPanel.add(machineLifeLabel);
        add(topPanel, BorderLayout.NORTH);

        resultTextArea = new JTextArea();
        resultTextArea.setEditable(false);
        add(resultTextArea, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new GridLayout(1, 3));
        JButton pierreButton = new JButton("Pierre");
        JButton feuilleButton = new JButton("Feuille");
        JButton ciseauButton = new JButton("Ciseau");

        pierreButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                play(0);
            }
        });

        feuilleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                play(1);
            }
        });

        ciseauButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                play(2);
            }
        });

        buttonPanel.add(pierreButton);
        buttonPanel.add(feuilleButton);
        buttonPanel.add(ciseauButton);

        add(buttonPanel, BorderLayout.SOUTH);
    }

    private void play(int userChoice) {
        Random random = new Random();
        int machineChoice = random.nextInt(3);

        switch (machineChoice) {
            case 0: // Pierre
                if (userChoice == 0) {
                    resultTextArea.append("Egalité ! L'ordi avait choisi Pierre\n");
                } else if (userChoice == 1) {
                    resultTextArea.append("Gagné ! L'ordi avait choisi Pierre\n");
                    machineLife--;
                } else if (userChoice == 2) {
                    resultTextArea.append("Perdu ! L'ordi avait choisi Pierre\n");
                    userLife--;
                }
                break;
            case 1: // Feuille
                if (userChoice == 0) {
                    resultTextArea.append("Perdu l'ordi a choisi Feuille !\n");
                    userLife--;
                } else if (userChoice == 1) {
                    resultTextArea.append("Egalité L'ordi a choisi Feuille!\n");
                } else if (userChoice == 2) {
                    resultTextArea.append("Gagné ! l'ordi a choisi Feuille\n");
                    machineLife--;
                }
                break;
            case 2: // Ciseau
                if (userChoice == 0) {
                    resultTextArea.append("Gagné ! L'ordi a choisi Ciseau\n");
                    machineLife--;
                } else if (userChoice == 1) {
                    resultTextArea.append("Perdu ! L'ordi a choisi Ciseau\n");
                    userLife--;
                } else if (userChoice == 2) {
                    resultTextArea.append("Egalité ! L'ordi a choisi Ciseau !\n");
                }
                break;
        }

        userLifeLabel.setText("Vies restantes : " + userLife);
        machineLifeLabel.setText("Vies de l'ordi : " + machineLife);

        if (userLife == 0) {
            resultTextArea.append("Perdu ! Tu n'as plus de vie !\n");
            disableButtons();
        }
        if (machineLife == 0) {
            resultTextArea.append("Gagné ! L'ordi n'a plus de vie !\n");
            disableButtons();
        }
    }

    private void disableButtons() {
        Component[] components = getContentPane().getComponents();
        for (Component component : components) {
            if (component instanceof JPanel) {
                Component[] buttons = ((JPanel) component).getComponents();
                for (Component button : buttons) {
                    button.setEnabled(false);
                }
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new PierreFeuilleCiseauxGUI().setVisible(true);
            }
        });
    }
}

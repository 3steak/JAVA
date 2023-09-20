package SwingTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserInputSwing {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        // Créer une fenêtre Swing
        JFrame frame = new JFrame("User Input");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(new BorderLayout());

        // Créer un panneau pour organiser les composants
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));

        // Champ de texte pour le nom d'utilisateur
        JTextField nameField = new JTextField();
        panel.add(new JLabel("Enter username: "));
        panel.add(nameField);

        // Champ de texte pour l'âge
        JTextField ageField = new JTextField();
        panel.add(new JLabel("Enter your age: "));
        panel.add(ageField);

        // Bouton "Submit"
        JButton submitButton = new JButton("Submit");
        panel.add(submitButton);

        // Ajouter le panneau au cadre
        frame.add(panel, BorderLayout.CENTER);

        // Gérer l'action du bouton "Submit"
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userName = nameField.getText();
                String ageText = ageField.getText();

                try {
                    int userAge = Integer.parseInt(ageText);
                    // Afficher le nom d'utilisateur et l'âge dans une boîte de dialogue
                    JOptionPane.showMessageDialog(frame, "Username is: " + userName + "\nAge is: " + userAge);
                } catch (NumberFormatException ex) {
                    // Gérer les erreurs de conversion d'âge
                    JOptionPane.showMessageDialog(frame, "Invalid age. Please enter a valid age as a number.");
                }
            }
        });

        // Rendre la fenêtre visible
        frame.setVisible(true);
    }
}

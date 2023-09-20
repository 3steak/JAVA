package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Etudiant {

	public static void main(String[] args) throws ClassNotFoundException, InterruptedException {
		// Informations de connexion

		String jdbcUrl = "jdbc:mysql://localhost:3306/students_java?characterEncoding=utf8";
		String user = "root";
		String password = "";

		// données à insérer

		String nom = "Benoit";
		String prenom = "David";
		String date_naissance = "1982-12-10";
		String email = "benoit.david@gmail.com";
		String matricule = "E240";

		try {

			// charger le pilote, utiliser la methode forName
			Class.forName("com.mysql.jdbc.Driver");

			// créer l'objet de connexion
			Connection connection = DriverManager.getConnection(jdbcUrl, user, password);

			int userChoice = 0;
			do {
				Scanner userInput = new Scanner(System.in);
				System.out.println("WHAT DO YOU WANT TO DO ?\n" + "Taper 1 pour : Afficher la liste d'éléve\n"
						+ "Taper 2 pour : Inserer Benoit David dans la liste\n"
						+ "Taper 3 pour : Supprimer Martin Sophie\n"
						+ "Taper 4 pour : Mettre à jour Lefebvre Thomas par Petit Jean\n" + "Taper 5 pour Exit");

				userChoice = userInput.nextInt();

				switch (userChoice) {
				case 1: {
					// SELECT

					String sql2 = "SELECT * FROM `etudiants`";
					// créer l'objet statement
					PreparedStatement preparedStatement2 = connection.prepareStatement(sql2);

					// excecuter

					ResultSet result = preparedStatement2.executeQuery();

					while (result.next())
						System.out.println(result.getInt("id") + "  " + result.getString("nom") + "  "
								+ result.getString("prenom"));

					// étape 5: fermez l'objet de connexion
					preparedStatement2.close();
					Thread.sleep(5000);
					break;
				}
				case 2: {
					// Inserer

					String sql = "INSERT INTO `etudiants`(`nom`, `prenom`, `date_naissance`, `email`, `matricule`) VALUES (?,?,?,?,?)";
					// créer l'objet statement
					PreparedStatement preparedStatement = connection.prepareStatement(sql);

					preparedStatement.setString(1, nom);
					preparedStatement.setString(2, prenom);
					preparedStatement.setString(3, date_naissance);
					preparedStatement.setString(4, email);
					preparedStatement.setString(5, matricule);

					// excecuter

					int lignesAffectees = preparedStatement.executeUpdate();

					if (lignesAffectees > 0) {
						System.out.println("Insertion a reussi");
					} else {
						System.out.println("Insertion a echoué");
					}
					Thread.sleep(5000);
					break;
				}
				case 3: {
					// delete
					String delete = "DELETE FROM `etudiants` WHERE `nom` = 'Martin'";

					PreparedStatement preparedStatement4 = connection.prepareStatement(delete);
					int resultDelete = preparedStatement4.executeUpdate();

					if (resultDelete > 0) {
						System.out.println("Suppresion ok ");
					} else {
						System.out.println("Suppresion échoué");
					}
					Thread.sleep(5000);
					break;
				}
				case 4: {
					// UPDATE
					String newName = "Petit";
					String update = "UPDATE `etudiants` SET `nom`= '" + newName + "' WHERE `prenom`= 'Jean'";

					PreparedStatement preparedStatement3 = connection.prepareStatement(update);
					int resultUpdate = preparedStatement3.executeUpdate();

					if (resultUpdate > 0) {
						System.out.println("Mis a jour ok ");
					} else {
						System.out.println("La mis a jour à échoué");
					}
					Thread.sleep(5000);
					break;

				}

				// end switch
				}
			} while (userChoice < 4);

			connection.close();
		} catch (ClassNotFoundException e) {
			// Gestion des exceptions liées au chargement du pilote JDBC
			e.printStackTrace();
		} catch (SQLException e) {
			// Gestion des exceptions liées à la connexion à la base de données
			e.printStackTrace();
		}
		// end class
	}

}

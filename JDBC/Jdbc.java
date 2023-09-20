package JDBC;

import java.sql.*;

public class Jdbc {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		// Information de connexion a la DB
		String jdbcUrl = "jdbc:mysql://localhost:3306/students_java?characterEncoding=utf8";
		String user = "root";
		String password = "";

		try

		{
			// étape 1: charger le pilote, utiliser la methode forName
			Class.forName("com.mysql.jdbc.Driver");

			// étape 2: créer l'objet de connexion
			Connection connection = DriverManager.getConnection(jdbcUrl, user, password);

			// Verif si connection ok
			if (connection != null) {
				System.out.println("Connexion ok !");
			} else {
				System.out.println("La connexion à la base a échoué ! ");
			}
			// étape 3: créer l'objet statement
			Statement stmt = connection.createStatement();
			ResultSet res = stmt.executeQuery("SELECT * FROM etudiants");

			// étape 4: exécuter la requête
			while (res.next())
				System.out.println(res.getInt("id") + "  " + res.getString("nom") + "  " + res.getString("prenom"));

			// étape 5: fermez l'objet de connexion
			connection.close();
		} catch (ClassNotFoundException e) {
			// Gestion des exceptions liées au chargement du pilote JDBC
			e.printStackTrace();
		} catch (SQLException e) {
			// Gestion des exceptions liées à la connexion à la base de données
			e.printStackTrace();
		}

	}
}

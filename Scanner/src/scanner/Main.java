package scanner;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try {

			// Entrer d'un prenom au clavier
			Scanner userInputName = new Scanner(System.in);
			System.out.println("Enter username");

			String userName = userInputName.nextLine();
			System.out.println("Username is : " + userName);

			// entrer d'un age
			Scanner userInputAge = new Scanner(System.in);
			System.out.println("Enter your age");

			int userAge = userInputAge.nextInt();
			System.out.println("L'age est : " + userAge);
			userInputName.close();
			userInputAge.close();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

		// End main
	}

}

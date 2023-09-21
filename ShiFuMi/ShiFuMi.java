package ShiFuMi;

import java.util.Random;
import java.util.Scanner;

public class ShiFuMi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			int userLife = 3;
			int machineLife = 3;

			// do
			do {
				// entrer d'un chiffre
				Scanner userInput = new Scanner(System.in);
				System.out.println("Pierre Feuille Ciseau contre la Console !\n" + "Tape 0 pour Pierre\n"
						+ "Tape 1 pour Feuille\n" + "Tape 2 pour Ciseau\n" + "Toi et l'ordinateur avez 3 vies !");

				int userChoice = userInput.nextInt();
				Random random = new Random();

				int machineChoice = random.nextInt(2);

				switch (machineChoice) {
				case 0: {
					if (userChoice == 0) {
						System.out.println("Egalité ! L'ordi avait choisi Pierre");
						Thread.sleep(3000);
						break;
					} else if (userChoice == 1) {
						System.out.println("Gagné ! L'ordi avait choisi Pierre");
						Thread.sleep(3000);
						machineLife--;
						System.out.println("Vies restante : " + userLife + "\n" + "Vies de l'ordi " + machineLife);
						Thread.sleep(3000);

						break;
					} else if (userChoice == 2) {
						System.out.println("Perdu ! L'ordi avait choisi Pierre");
						Thread.sleep(3000);
						userLife--;
						System.out.println("Vies restante : " + userLife + "\n" + "Vies de l'ordi " + machineLife);
						Thread.sleep(3000);
						break;
					}
				}
				case 1: {
					if (userChoice == 0) {
						System.out.println("Perdu l'ordi a choisi Feuille !");
						Thread.sleep(3000);
						userLife--;
						System.out.println("Vies restante : " + userLife + "\n" + "Vies de l'ordi " + machineLife);
						Thread.sleep(3000);
						break;
					} else if (userChoice == 1) {
						System.out.println("Egalité L'ordi a choisi Feuille! ");
						Thread.sleep(3000);

						break;
					} else if (userChoice == 2) {
						System.out.println("Gagné ! l'ordi a choisi Feuille");
						Thread.sleep(3000);
						machineLife--;
						System.out.println("Vies restante : " + userLife + "\n" + "Vies de l'ordi " + machineLife);
						Thread.sleep(3000);
						break;
					}
				}
				case 2: {
					if (userChoice == 0) {
						System.out.println("Gagné ! L'ordi a choisi Ciseau");
						Thread.sleep(3000);
						machineLife--;
						System.out.println("Vies restante : " + userLife + "\n" + "Vies de l'ordi " + machineLife);
						Thread.sleep(3000);
						break;
					} else if (userChoice == 1) {
						System.out.println("Perdu ! L'ordi a choisi Ciseau");
						Thread.sleep(3000);
						userLife--;
						System.out.println("Vies restante : " + userLife + "\n" + "Vies de l'ordi " + machineLife);
						Thread.sleep(3000);
						break;
					} else if (userChoice == 2) {
						System.out.println("Egalité ! L'ordi a choisi Ciseau !");
						Thread.sleep(3000);
						break;
					}
				}

				// end Case
				}
				if (userLife == 0) {
					System.out.println("Perdu ! Tu n'as plus de vie ! ");
					Thread.sleep(3000);
					userInput.close();
				}
				if (machineLife == 0) {
					System.out.println("Gagné ! L'ordi n'a plus de vie ! ");
					Thread.sleep(3000);
					userInput.close();
				}
			} while (userLife != 0 || machineLife != 0);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
}

package metier;

import model.Client;
import model.Compte;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Compte c1 = new Compte("oioioio");
		
		System.out.println(c1.toString());
		
		Client client1 = new Client("Cyp", c1);
		System.out.println(client1);
	}
}

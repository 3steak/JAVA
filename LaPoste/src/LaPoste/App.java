package LaPoste;

import model.Compte;

public class App {

	public static void main(String[] args) {

		ObjetPostal objetPostal1 = new ObjetPostal("ObjetPostal", "1rue", "35000", "VILLE", true);

		System.out.println(objetPostal1);
		System.out.println("--------------");
		
		ObjetPostal lettre2 = new Lettre("Lettre1", "2rue", "35000", "VILLE de la lettre", true, true);

		System.out.println(lettre2);
		System.out.println("--------------");
		
		
		ObjetPostal colis1 = new Colis("Colis", "3rue", "44000", "Nantes", true,3200 );

		System.out.println(colis1);
		((Colis) colis1).affran();
		System.out.println("--------------");	
	}
}

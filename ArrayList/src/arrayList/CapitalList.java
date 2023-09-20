package arrayList;

import java.util.ArrayList;
import java.util.List;

public class CapitalList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Creer une liste pour stocker des capitales sous forme de chaînes de caractères
		List<String> capitalList = new ArrayList<>();

// Ajoute des capitales à la liste sous forme de chaine de caracteres
		capitalList.add("England:London");
		capitalList.add("Germany:Berlin");
		capitalList.add("Norway:Oslo");
		capitalList.add("Usa:Washington DC");

		System.out.println("Liste de départ : " + capitalList+ "\n");

// Accede a la capitale de l'angleterre dans la liste en utilisant la methode get()
		String cityOfEngland = null;
		for (String capital : capitalList) {
			String[] keyValue = capital.split(":"); // divise la capitale en pays et ville
			if (keyValue.length == 2 && keyValue[0].equals("England")) {
				cityOfEngland = keyValue[1];
				break;
			}
		}
		System.out.println("capital de l'angleterre : "+ cityOfEngland+ "\n");
		capitalList.remove(0);
		System.out.println("Liste après avoir supprimé England et sa capitale :"+ capitalList+ "\n");
		int size = capitalList.size();
		System.out.println("Capital restante " + size + "\n");

		
		String country = null;
		for(String capital : capitalList) {
			String[] keyValue = capital.split(":"); // divise la capitale en pays et ville
			if(keyValue.length ==2) {
				country = keyValue[0];
				capital = keyValue[1];
				System.out.println( "Pays : "+country + "\r Capitale : " + capital);
			}
		}
		
		
		
		// end main
	}
}

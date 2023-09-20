package Hashmap;

import java.util.HashMap;
import java.util.Map;

public class CapitalMap {

	public static void main(String[] args) {
		// Créer une HashMap pour stocker les capitales avec leur pays associé
		Map<String, String> capitalMap = new HashMap<>();

		// Ajouter des capitales à la HashMap
		capitalMap.put("England", "London");
		capitalMap.put("Germany", "Berlin");
		capitalMap.put("Norway", "Oslo");
		capitalMap.put("USA", "Washington DC");

		System.out.println("HashMap de départ : " + capitalMap + "\n");

		// Accéder à la capitale de l'Angleterre en utilisant la clé "England"
		String cityOfEngland = capitalMap.get("England");
		System.out.println("Capitale de l'Angleterre : " + cityOfEngland + "\n");

		// Supprimer l'Angleterre et sa capitale de la HashMap
		capitalMap.remove("England");
		System.out.println("HashMap après avoir supprimé l'Angleterre et sa capitale : " + capitalMap + "\n");

		int size = capitalMap.size();
		System.out.println("Nombre de capitales restantes : " + size + "\n");

		// Parcourir la HashMap et afficher les pays et capitales
		for (Map.Entry<String, String> entry : capitalMap.entrySet()) {
			String country = entry.getKey();
			String capital = entry.getValue();
			System.out.println("Pays : " + country + "\r Capitale : " + capital);
		}

		// Fin class
	}
}

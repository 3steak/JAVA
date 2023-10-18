package Enum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Test extends Livre {

	public static void main(String[] args) {
		Livre l1 = new LivreEmpruntable("titre1", "auteur1", GenreLivre.BD, 1998, true);
		Livre l2 = new LivreEmpruntable("titre2", "auteur2", GenreLivre.MANGA, 2000, true);
		Livre l3 = new LivreEmpruntable("titre3", "auteur3", GenreLivre.ROMAN, 2010, false);
		Livre l4 = new LivreEmpruntable("titre4", "auteur2", GenreLivre.MANGA, 2009, true);
		Livre l5 = new LivreEmpruntable("titre5", "auteur2", GenreLivre.MANGA, 2010, true);
		Livre l6 = new LivreEmpruntable("titre6", "auteur2", GenreLivre.MANGA, 2011, true);

		ArrayList<Livre> listeLivre = new ArrayList<>();
		listeLivre.add(l1);
		listeLivre.add(l2);
		listeLivre.add(l3);
		listeLivre.add(l4);
		listeLivre.add(l5);
		listeLivre.add(l6);

		for (Livre livre : listeLivre) {
			System.out.println(livre);
		}

		System.out.println("-----------------------------");

		int[] nums = { 3, 6, 8 };

		int sum = 0;
		for (int num : nums) {
			sum += num;
		}
		System.out.println(sum);

		System.out.println("-----------------------------");
		List<Integer> listNums = Arrays.asList(3, 6, 8);
		int sumList = 0;
		listNums.forEach(num -> {
			System.out.println("La valeur : " + (sumList + num));
		});

		System.out.println("-----------------------------");

		List<Integer> total = listNums.stream().filter(value -> value > 3).toList();

		System.out.println(total);

		System.out.println("-----------------------------");
		int totalAnnee = 0;
		int nombreLivre = 0;
		for (Livre livre : listeLivre) {
			if (livre.getGenre() == GenreLivre.MANGA) {
				totalAnnee += livre.getAnnee();
				nombreLivre++;
			}
		}
		double moyenne = totalAnnee / nombreLivre;
		System.out.println(moyenne);

		System.out.println("-----------------------------");

		double moyenne2 = listeLivre.stream().filter(livre -> livre.getGenre() == GenreLivre.MANGA)
				.mapToInt(livre -> livre.getAnnee()).average().orElse(0);
		System.out.println(moyenne2);
		System.out.println("-----------------------------");
	}
}

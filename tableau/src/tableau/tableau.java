package tableau;

import java.util.ArrayList;
import java.util.List;

public class tableau {

	// creation méthode pour print les tableaux
	public static void printTab(int[] tab) {

		// boucler un tableau
		for (int number : tab)
			System.out.println(number);
	}

	public static void main(String[] args) {
		List<String> myList = new ArrayList<String>();
		myList.add("Virgile");
		myList.add("Oui");

		System.out.println(myList);

		int[] tab = { 1, 2, 3 };
		printTab(tab);
	}
}

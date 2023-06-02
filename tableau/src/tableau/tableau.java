package Tableau;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Tableau {

	// creation méthode pour print les tableaux
	// public static void printTab(int[] tab) {

	// // boucler un tableau
	// for (int number : tab)
	// System.out.println(number);
	// }

	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();

		Student sakai = new Student("Sakai", 29);
		Student alex = new Student("Alex", 20);

		students.add(sakai);
		students.add(alex);

		ListIterator<Student> list = students.listIterator();

		while (list.hasNext())
			System.out.println(list.next().sayHello());
	}
}

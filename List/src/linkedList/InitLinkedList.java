package linkedList;

import java.util.LinkedList;

public class InitLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Creation d'une liste chainée (LinkedList)
		LinkedList<String> linkedList = new LinkedList<>();
		
		// Ajaout d'éléments à la liste
		
		linkedList.add("Element 1");
		linkedList.add("Element 2");
		linkedList.add("Element 3");
		
		// Affichage de la liste
		System.out.println("Liste chainée initiale :"+ linkedList);
		
		// Ajout d'un element à la premiere position
		linkedList.addFirst("Nouvel element en premier");
		
		// Ajout d'un element à la derniere position
		linkedList.addLast("Nouvel element à la fin");
		
		// suppression du deuxieme élément
		linkedList.remove(1);
		
		//affichage de la liste mis a jour
		System.out.println("Liste chainée après modifications: "+linkedList);
		
		
		//End class
	}

}

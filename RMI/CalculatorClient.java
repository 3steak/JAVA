package RMI;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CalculatorClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	//Obtient une référence au registre RMI sur le serveur
	Registry registry = LocateRegistry.getRegistry("localhost", 1099);
	
	//Recherche l'objet distant par son nom
	CalculatorInterface calculator = (CalculatorInterface) registry.lookup("CalculatorService");
	
	//Utilise la méthode distante pour effectuer l'addition
	int a = 10;
	int b = 5;
	int result = calculator.add(a,b);
	
	//Affiche le résultat
	System.out.println("Resultat : "+ result);
} catch (Exception e) {
	// TODO: handle exception
}
	}

}

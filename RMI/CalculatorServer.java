package RMI;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

// La classe qdu serveur doit emplémenter l'interface distante
public class CalculatorServer extends UnicastRemoteObject implements CalculatorInterface {

	// Constructeur par défaut
	public CalculatorServer() throws RemoteException {
		super();
	}

	// Méthode d'addition
	@Override
	public int add(int a, int b) throws RemoteException {
		return a + b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			// Crée un objet serveur
			CalculatorServer server = new CalculatorServer();

			// Creer un registre RMI sur le port 1099
			LocateRegistry.createRegistry(1099);

			// Lie l'objet serveur au registre RMI avec un nom
			Naming.rebind("CalculatorService", server);

			System.out.println("Server RMI prêt");
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("Erreur du serveur RMI : " + e.toString());
			e.printStackTrace();
		}
	}

}

package RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CalculatorInterface extends Remote {
	int add(int a, int b) throws RemoteException;
}

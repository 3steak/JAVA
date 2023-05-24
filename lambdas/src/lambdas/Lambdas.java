package lambdas;

public class Lambdas {
	// Inteface
	public interface Etudiant {
		void donnerNom(String nom);
	}

	public static void main(String[] args) {

		// Utilisation
		Etudiant etudiant = (nomEtudiant) -> {
			System.out.println("Il s'appelle "+ nomEtudiant);
		};
		etudiant.donnerNom("Louis");// Affichera Toto
	}
}

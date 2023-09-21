package Modificator;

public class InitModificateurs {

	public int variablePublique; // Variable Publique
	private int variablePrivee; // Variable Privée
	protected int variableProtegee; // Variable Protégée

	// constructeur par défault
	public InitModificateurs() {
		variablePublique = 1;
		variablePrivee = 2;
		variableProtegee = 3;
	}

	// methode publique
	public void methodePublique() {
		System.out.println("Methode publique");
	}

	// Méthode privée
	private void methodePrivee() {
		System.out.println("Methode privée");
	}

	// Methode protege
	protected void methodeProtegee() {
		System.out.println("Methode protégée");
	}

	// methode par defaut (Package-privée)
	void methodeParDefaut() {
		System.out.println("Methode par défaut (package-private)");
	}

	public static void main(String[] args) {

		InitModificateurs exemple = new InitModificateurs();

		System.out.println(exemple.variablePublique);// OK accessible
		// System.out.println(exemple.variablePrivee);//erreur compilation, innacessible
		// depuis d'autres classes
		System.out.println(exemple.variableProtegee); // Ok accessible depuis les sous classes
		exemple.methodeProtegee();// Ok, accessivle depuis les sous-classe
		exemple.methodeParDefaut();// Ok, accessible depuis le meme package
	}
}

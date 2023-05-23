package hello;

public class OC {
	public static void main(String[] args) {
		Voiture vauxhall = new Voiture();
		vauxhall.start();

		Bateau bateau = new Bateau();
		bateau.start();
	}
}

class Vehicule {
	void start() {
		System.out.println("VROOOMMMMM");
	}
}

class Voiture extends Vehicule {
	
	@Override
	void start() {
// call to super for constructor param 
		super.start();
		allumerFeux();
	}

	void allumerFeux() {
		System.out.println("Allumage des feux");
	}
}

class Bateau extends Vehicule {
}
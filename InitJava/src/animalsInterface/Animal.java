package animalsInterface;

public class Animal implements Swim, Fly, Climb, Walk {

	private String name;

	// Constructeur de la classe Animal

	public Animal(String name) {
		this.name = name;
	}

	// Methode swim
	@Override
	public void swim() {
		System.out.println(name + " nage");
	}

	// Methode fly
	@Override
	public void fly() {
		System.out.println(name + " vole");
	}

	// Methode Climb
	@Override
	public void climb() {
		System.out.println(name + " grimpe");
	}

	// Methode Walk
	@Override
	public void walk() {
		System.out.println(name + " marche");
	}

	// end class
}

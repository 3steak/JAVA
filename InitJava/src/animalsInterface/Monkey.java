package animalsInterface;

public class Monkey implements Climb, Walk {
	private String name;

// construct
	public Monkey(String name) {
		this.name = name;
	}

	@Override
	public void climb() {
		System.out.println(name + " grimpe à l'arbre");
	}

	@Override
	public void walk() {
		System.out.println(name + "marche vite");
	}
// end class 
}

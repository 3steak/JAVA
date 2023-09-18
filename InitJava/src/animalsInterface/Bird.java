package animalsInterface;

public class Bird implements Fly, Walk {
	private String name;

	public Bird(String name) {
		this.name = name;
	}

	@Override
	public void fly() {
		System.out.println(name + " vole !");
	}

	@Override
	public void walk() {
		System.out.println(name + " marche :O ! ");
	}
	// end Bird
}

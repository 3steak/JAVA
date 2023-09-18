package animalsInterface;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal duck = new Animal("Canard");
		duck.swim();
		duck.fly();

		Animal bat = new Animal("Chauve-souris");
		bat.fly();
		bat.walk();

		Monkey monkey1 = new Monkey("Phillippe");
		monkey1.climb();
		
		Bird bird1 = new Bird("Roucoups");
		bird1.fly();
		bird1.walk();
	}
//end main
}

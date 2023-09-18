package shapesInheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle circle = new Circle(5.0);
		System.out.println(circle.getName() + " - Aire : "+ circle.calculateAera());
		
		Rectangle rectangle = new Rectangle(4.00, 6.00);
		System.out.println(rectangle.getName() + " - Aire : "+ rectangle.CalculateAera());
		
	}
// end Main
}

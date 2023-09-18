package shapesInheritance;

public class Rectangle extends GeometricShape {

	private double width;
	private double height;

	public Rectangle (double width, double height) {
		this.width = width;
		this.height = height;
	}
	@Override
	public String getName() {
		return "Rectangle";
	}
	
	// fonction pour calculer l'air d'un rectangle
	public double CalculateAera() {
		return width * height;
	}
	
	//End Rectangle
}

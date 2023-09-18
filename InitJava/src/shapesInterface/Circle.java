package shapesInterface;

public class Circle implements GeometricShape{

		private double radius;

		public Circle(double radius) {
			this.radius = radius;
		}
		// redéfinition de la méthode pour obtenir le nom de la forme 
		@Override
		public String getName() {
			return "Cercle";
		}
		
		// methode pour calculer l'air du cercle
		// return math.PI * radius;
		// calcule l'air d'un certcle en utilisant la formule mathématique pi fois r²
		@Override
		public double calculateAera() {
			return Math.PI * radius *radius;
		}
	//end Circle
	}

}

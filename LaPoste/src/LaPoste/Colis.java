package LaPoste;

public class Colis extends ObjetPostal{

	
	private double weight;

	public Colis(String name, String adress, String postalCode, String town, boolean toSend, double weight) {
		super(name, adress, postalCode, town, toSend);
		this.weight = weight;
	}
	
	// getter setter
	public double getWeight() {
		return weight;
	}	

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	// methode affranchissement 
	
	public void affran(){
		//- prix 0.8 euros par unité de poids de 100 grammes

		double base = 0.8;
		
		double weightGr = getWeight()/100;
		double  price = weightGr*base;
		
		if(isToSend()) {
			price += 3;
		}
		System.out.println("Son tarif d'affranchissement ="+ price + " euros");
	}
	
	@Override
	public String toString() {
		return "Nom :"+ getName() + ", adresse :" + getAdress() + ", code postal =" + getPostalCode() + getTown() 
		+ ", en recommandé =" + isToSend() + ", Poids :" + weight/1000+ " Kgs";
	}
	// endclass
}

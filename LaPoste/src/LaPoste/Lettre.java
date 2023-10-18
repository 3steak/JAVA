package LaPoste;

public class Lettre extends ObjetPostal{

	private boolean urgency;

	// constructeur
	public Lettre(String name, String adress, String postalCode, String town, boolean toSend, boolean urgency) {
		super(name, adress, postalCode, town, toSend);
		this.urgency = urgency;
	}
	
	// getter setter
	public boolean isUrgency() {
		return urgency;
	}

	public void setUrgency(boolean urgency) {
		this.urgency = urgency;
	}

	// méthode prix affranchissement
	public void affran(){
		double price = 0.53;
		
		if(isToSend() == true) {
			price += 0.5;
		}
		if(isUrgency() == true) {
			price += 0.5;
		}
		System.out.println("Son tarif d'affranchissement = "+ price + " euros");
	}
	
	
	// to string, ajout de urgence ou non
	@Override
	public String toString() {
		return "Nom =" + getName() + ", adresse =" + getAdress() + ", code postal =" + getPostalCode() + ", ville =" + getTown() 
		+ ", en recommandé =" + isToSend() +", est urgente =" + urgency;
	}
	// end class 
}

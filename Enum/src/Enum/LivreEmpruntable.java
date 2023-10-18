package Enum;

public class LivreEmpruntable extends Livre {

	private boolean disponible;


	public LivreEmpruntable(String titre, String auteur, GenreLivre genre, int annee, boolean disponible) {
		super(titre, auteur, genre, annee);
		this.disponible = disponible;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	@Override
	public String toString() {
		return super.toString() + " disponible : " + (disponible ? "oui": "non");
	}
    
    
}

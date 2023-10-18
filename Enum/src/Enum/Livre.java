package Enum;

public class Livre {

	private String titre;
	private String auteur;
	private GenreLivre genre;
	private int annee;
	
	public Livre() {};
	
	public Livre(String titre, String auteur, GenreLivre genre, int annee) {
		this.titre = titre;
		this.auteur = auteur;
		this.genre = genre;
		this.annee = annee;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}


	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public GenreLivre getGenre() {
		return genre;
	}

	public void setGenre(GenreLivre genre) {
		this.genre = genre;
	}


	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	@Override
	public String toString() {
		return "Livre " + titre + ", auteur : " + auteur + ", genre : " + genre + ", annee :" + annee;
	}
}

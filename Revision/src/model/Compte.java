package model;

public class Compte {

	private String numero;
	private double solde;

	// constructeur
	public Compte(String numero) {
		this.numero = numero;
	}

	// setter
	public void setNumero(String numero) {
		this.numero = numero;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	// getter
	public String getNumero() {
		return numero;
	}

	public double getSolde() {
		return solde;
	}

	@Override
	public String toString() {
		return "Compte numero=" + numero + ", solde=" + solde;
	}
	// end class
}

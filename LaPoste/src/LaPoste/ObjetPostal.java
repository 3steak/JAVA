package LaPoste;

public class ObjetPostal {

	private String name;
	private String adress;
	private String postalCode;
	private String town;
	private boolean toSend;

	// constructeur
	public ObjetPostal(String name, String adress, String postalCode, String town, boolean toSend) {
		this.name = name;
		this.adress = adress;
		this.postalCode = postalCode;
		this.town = town;
		this.toSend = toSend;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public boolean isToSend() {
		return toSend;
	}

	public void setToSend(boolean toSend) {
		this.toSend = toSend;
	}

	@Override
	public String toString() {
		return "ObjetPostal Son nom est : " + name + ", son adresse : " + adress + ", son code postal : " + postalCode + ", sa ville : " + town
				+ ", en recommandé =" + toSend;
	}

}

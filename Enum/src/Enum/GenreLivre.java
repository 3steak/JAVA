package Enum;

public enum GenreLivre {

	ROMAN("Roman", "..."), BD("Bd", "desc bd..."),MANGA("manga", "desc manga...");

	private String type;
	private String desc;
	
	GenreLivre(String type, String desc) {
		this.type = type;
		this.desc = desc;
	}

	public String getType() {
		return type;
	}

	public String getDesc() {
		return desc;
	}
}

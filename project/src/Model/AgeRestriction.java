package Model;

public enum AgeRestriction {
	NA("NA"),
	PG13("PG13"),
	NC16("NC16"),
	M18("M18"),
	R21("R21");

	private final String text;

	private AgeRestriction(String text) {
		this.text = text;
	}

	public String toString(){
		return text;
	}
}

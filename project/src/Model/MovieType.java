package Model;

public enum MovieType {
	NA("NA"),
	TWO_D("2D"),
	THREE_D("3D"),
	BLOCKBUSTER("Blockbuster");

	private final String text;

	private MovieType(String text) {
		this.text = text;
	}

	public String toString(){
		return text;
	}
}

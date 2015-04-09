package models;

public class Card {

	private boolean uncovered;
	
	
	public Card(boolean uncovered) {
		super();
		this.uncovered = uncovered;
	}
	
	public boolean isUncovered() {
		return uncovered;
	}
	
	public void setUncovered(boolean uncovered) {
		this.uncovered = uncovered;
	}


}

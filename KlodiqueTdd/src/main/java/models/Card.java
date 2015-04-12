package models;

public class Card {

	private boolean uncovered;
	private Foundation foundation;
	private Integer number;
	
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

	public Foundation getFoundation() {
		return foundation;
	}

	public void setFoundation(Foundation foundation) {
		this.foundation = foundation;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	


}

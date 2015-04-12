package models;

public class Foundation {
	private FoundationsType foundation;
	private ColorType color;
	
	
	
	
	public Foundation(FoundationsType foundation, ColorType color) {
		super();
		this.foundation = foundation;
		this.color = color;
	}
	public FoundationsType getFoundation() {
		return foundation;
	}
	public void setFoundation(FoundationsType foundation) {
		this.foundation = foundation;
	}
	public ColorType getColor() {
		return color;
	}
	public void setColor(ColorType color) {
		this.color = color;
	}
	
	

}

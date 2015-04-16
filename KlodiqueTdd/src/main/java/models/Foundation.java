package models;

public class Foundation {
	private FoundationsType foundation;
	private ColorType color;
	
	
	
	
	public Foundation(FoundationsType foundation) {
		super();
		this.foundation = foundation;
		
		switch (foundation){
			case HEART: case DIAMOND:{
				this.color = ColorType.RED;
				break;
			}
			case CLOVER: case SPADES:{
				this.color = ColorType.BLACK;
				break;
			}
		}
		
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

package models;

public class Foundation {
	private FoundationsType foundationType;
	private ColorType color;
	
	
	
	
	public Foundation(FoundationsType foundation) {
		super();
		this.foundationType = foundation;
		
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
	public FoundationsType getFoundationType() {
		return foundationType;
	}
	public void setFoundationType(FoundationsType foundationType) {
		this.foundationType = foundationType;
	}
	public ColorType getColor() {
		return color;
	}
	public void setColor(ColorType color) {
		this.color = color;
	}
	
	

}

public final class PrairieDog extends Mammal {
	String tailColor;
	Boolean burrow;

	PrairieDog(String name, int weight, String faveFood, String tailColor, Boolean burrow) {
		super(name, weight, faveFood);
		this.tailColor = tailColor;
		this.burrow = burrow;
	}

	PrairieDog(String name, String tailColor){
		super(name);
		this.tailColor = tailColor;
	}

	final String eat(){return "prairie grass seeds";}
	String getTailColor(){ return this.tailColor; }
	void setTailColor(String tailColor) {this.tailColor = tailColor; }
	Boolean getBurrow() {return this.burrow;}
	void setBurrow(Boolean burrow){this.burrow = burrow;}
	public String toString(){
		return this.name + " the " + this.getClass().getSimpleName() + " has a " + this.tailColor + " colored tail.";
	}

} 

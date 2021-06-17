public final class Snake extends Reptile{
	boolean venom;
	double length;
	final String foodType = foodTypeArray[0];

	Snake(String name, int weight, String faveFood, boolean venom, double length) {
		super(name, weight, faveFood);
		this.length = length;
		this.venom = venom;
	}

	Snake(String name, double length){
		super(name);
		this.length = length;
	}
	final String eat(){
		return "mice";
	}

	boolean getVenom(){return this.venom;}
	void setVenom(boolean venom){this.venom = venom;}
	double getLength(){return this.length;}
	void setLength(double length){this.length = length;}
	public String toString(){
		return this.name + " the " + this.getClass().getSimpleName() + " is " + this.length + " feet long.";
	}
}

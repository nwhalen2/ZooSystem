public final class Penguin extends Bird{
	final String foodType = foodTypeArray[0];
	double maxDive;
	Boolean bellySlide;

	Penguin(String name, int weight, String faveFood, double maxDive, Boolean bellySlide) {
		super(name, weight, faveFood);
		this.maxDive = maxDive;
		this.bellySlide = bellySlide;
	}
	Penguin(String name, double maxDive){
		super(name);
		this.maxDive = maxDive;
	}
	String eat(){
		return "fish";
	}
	double getMaxDive(){return this.maxDive;}
	void setMaxDive(double maxDive){this.maxDive = maxDive;}
	Boolean getBellySlide(){return this.bellySlide;}
	void setBellySlide(Boolean bellySlide){this.bellySlide = bellySlide;}
	public String toString(){
		return this.name + " the " + this.getClass().getSimpleName() + " can dive up to " + this.maxDive + " feet.";
	}
}
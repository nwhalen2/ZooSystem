public final class Turtle extends Reptile{
	double circumference;
	boolean isAquatic;
	final String foodType = foodTypeArray[2];
	Turtle(String name, int weight, String faveFood, double circumference, boolean isAquatic) {
		super(name, weight, faveFood);
		this.circumference = circumference;
		this.isAquatic = isAquatic;
	}

	Turtle(String name, double circumference){
		super(name);
		this.circumference = circumference;
	}
	final String eat(){
		return "lettuce";
	}
	double getCircumference(){return this.circumference;}
	void setCircumference(double circumference){this.circumference = circumference;}
	boolean isAquatic(){return this.isAquatic;}
	void isAquatic(boolean isAquatic){this.isAquatic = isAquatic;}
	public String toString(){
		return this.name + " the " + this.getClass().getSimpleName() + " has a shell that is " + this.circumference + " inches in circumference.";
	}
}

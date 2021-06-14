public final class Toucan extends Bird{
	double beakLength;
	double decibels;
	String foodType = foodTypeArray[1];

	Toucan(String name, int weight, String faveFood, double beakLength, double decibels) {
		super(name, weight, faveFood);
		this.beakLength = beakLength;
		this.decibels = decibels;
	}

	Toucan(String name, double beakLength){
		super(name);
		this.beakLength = beakLength;
	}

	String eat(){
		return "fruits and berries";
	}

	double getBeakLength(){return this.beakLength;}
	void setBeakLength(double beakLength){this.beakLength = beakLength;}
	double getDecibels(){return this.decibels;}
	void setDecibels(double decibels){this.decibels = decibels;}
	public String toString(){
		return this.name + " the " + this.getClass().getSimpleName() + " has a beak " + this.beakLength + " inches long.";
	}
}

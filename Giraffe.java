final class Giraffe extends Mammal {
	double neckLength;
	int numSpots;

	Giraffe(String name, int weight, String faveFood, double neckLength, int numSpots){
		super(name, weight, faveFood);
		this.neckLength = neckLength;
		this.numSpots = numSpots;
	}
	Giraffe(String name, double neckLength){
		super(name);
		this.neckLength = neckLength;
	}
	final String eat(){
		return "acacia leaves";
	}
	double getNeckLength(){
		return this.neckLength;
	}
	void setNeckLength(double neckLength){
		this.neckLength = neckLength;
	}
	int getNumSpots(){
		return this.numSpots;
	}
	void setNumSpots(int numSpots){
		this.numSpots = numSpots;
	}
	public String toString(){
		return this.name + " the " + this.getClass().getSimpleName() + " has a " + this.neckLength + " foot long neck.";
	}
}

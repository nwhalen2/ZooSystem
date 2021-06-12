abstract class Animal{ 

	String name;
	int weight;
	String foodType;
	String bloodType;

	// constructor
	Animal(String name, int weight, String food) {
		this.name = name;
		this.weight = weight;
		this.foodType = food;
	}

	abstract String reproduce();

	abstract String eat();

	String getName() { return this.name; }
	void setName(String name) { this.name = name; }

	int getWeight() { return this.weight; }
	void setWeight(int weight) { this.weight = weight; }

	String getFoodType() { return this.foodType; }
	void setFoodType(String food) { this.foodType = food; } 

	String getBloodType() { return this.bloodType; }
	void setBloodType(String blood) { this.bloodType = blood; }	

}

abstract class Mammal extends Animal {
	final String bloodType = "warm-blooded";
	Mammal(String name, int weight, String food) {
		super(name, weight, food);
	}

	final String reproduce() {
		return "vivaparous";
	}
	
	abstract String eat();

	String complexBrain() {
		return "has a complex brain";
	}

}

abstract class Bird extends Animal {
	final String bloodType = "warm-blooded";
	boolean fly;
	int wingSpan;

	Bird(String name, int weight, String food) {
		super(name, weight, food);
	}

	final String reproduce() {
		return "ovoviviparous";
	}

	abstract String eat();

	boolean getFly() { return this.fly;	}
	void setFly(boolean fly) { this.fly = fly; }

	int getWingSpan() { return this.wingSpan; }
	void setWingSpan(int wing) { this.wingSpan = wing; }

}

abstract class Reptile extends Animal {
	final String bloodType = "cold-blooded";
	boolean hasScales;
	boolean hasLegs;
	
	Reptile(String name, int weight, String food) {
		super(name, weight, food);
	}

	final String reproduce(){
		return "eggs";
	};
	abstract String eat();

	boolean getScales() { return this.hasScales; }
	void setScales(boolean scales) { this.hasScales = scales; }

	boolean getLegs() { return this.hasLegs; }
	void setLegs(boolean legs) { this.hasLegs = legs; }

}

final class Giraffe extends Mammal {
	
	double neckLength;
	int numSpots;

	Giraffe(String name, int weight, String food, double neckLength, int numSpots){
		super(name, weight, food);
		this.neckLength = neckLength;
		this.numSpots = numSpots;
	}

	String eat() {
		return "Acacia";
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
}
final class PrarieDog extends Mammal {
	String tailColor;
	Boolean burrow;

	PrarieDog(String name, int weight, String food, String tailColor, Boolean burrow) {
		super(name, weight, food);
		this.tailColor = tailColor;
		this.burrow = burrow;
	}

	String eat(){
		return "flowering plants";
	}

	String getTailColor(){ return this.tailColor; }
	void setTailColor(String tailColor) {this.tailColor = tailColor; }
	Boolean getBurrow() {return this.burrow;}
	void setBurrow(Boolean burrow){this.burrow = burrow;}
} 

final class Penguin extends Bird{

	double maxDive;
	Boolean bellySlide;

	Penguin(String name, int weight, String food, double maxDive, Boolean bellySlide) {
		super(name, weight, food);
		this.maxDive = maxDive;
		this.bellySlide = bellySlide;
	}

	String eat(){
		return "fish";
	}
	double getMaxDive(){return this.maxDive;}
	void setMaxDive(double maxDive){this.maxDive = maxDive;}
	Boolean getBellySlide(){return this.bellySlide;}
	void setBellySlide(Boolean bellySlide){this.bellySlide = bellySlide;}
}
final class Toucan extends Bird{
	double beakLength;
	double decibels;

	Toucan(String name, int weight, String food, double beakLength, double decibels) {
		super(name, weight, food);
		this.beakLength = beakLength;
		this.decibels = decibels;
	}

	String eat(){
		return "fruits and berries";
	}

	double getBeakLength(){return this.beakLength;}
	void setBeakLength(double beakLength){this.beakLength = beakLength;}
	double getDecibels(){return this.decibels;}
	void setDecibels(double decibels){this.decibels = decibels;}
}

final class Snake extends Reptile{
	boolean venom;
	double length;

	Snake(String name, int weight, String food, boolean venom, double length) {
		super(name, weight, food);
		this.length = length;
		this.venom = venom;
	}
	String eat(){
		return "mice";
	}

	boolean getVenom(){return this.venom;}
	void setVenom(boolean venom){this.venom = venom;}
	double getLength(){return this.length;}
	void setLength(double length){this.length = length;}
}
final class Turtle extends Reptile{
	double circumference;
	boolean isAquatic;
	Turtle(String name, int weight, String food, double circumference, boolean isAquatic) {
		super(name, weight, food);
		this.circumference = circumference;
		this.isAquatic = isAquatic;
	}
	String eat(){
		return "lettuce";
	}
	double getCircumference(){return this.circumference;}
	void setCircumference(double circumference){this.circumference = circumference;}
	boolean isAquatic(){return this.isAquatic;}
	void isAquatic(boolean isAquatic){this.isAquatic = isAquatic;}
}

public class ZooSystem {
	Animal[] alist;

	public void setupAnimals(){
		int numAnimals = 6;
		alist = new Animal[6];
		alist[0] = new Giraffe("Fred", 200000, String food, double neckLength, int numSpots);
		alist[1] = new PrarieDog(String name, int weight, String food, String tailColor, Boolean burrow);
		alist[2] = new Penguin(String name, int weight, String food, double maxDive, Boolean bellySlide);
		alist[3] = new Toucan(String name, int weight, String food, double beakLength, double decibels);
		alist[4] = new Snake(String name, int weight, String food, boolean venom, double length);
		alist[5] = new Turtle(String name, int weight, String food, double circumference, boolean isAquatic);
	}
	void printSummaryView(){

	}
	public static void main(String[] args) {
	}

}

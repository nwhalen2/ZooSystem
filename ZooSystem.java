abstract class Animal{ 

	String name;
	int weight;
	String foodType;
	String bloodType;
	String faveFood;
	String foodTypeArray[] = {"carnivore","herbivore","omnivore"};
	// constructor
	Animal(String name, int weight, String faveFood) {
		this.name = name;
		this.weight = weight;
		this.faveFood = faveFood;
	}

	abstract String reproduce();

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
	final String foodType = foodTypeArray[1];
	Mammal(String name, int weight, String faveFood) {
		super(name, weight, faveFood);
	}

	final String reproduce() {
		return "vivaparous";
	}

	String complexBrain() {
		return "has a complex brain";
	}

}

abstract class Bird extends Animal {
	final String bloodType = "warm-blooded";
	boolean fly;
	int wingSpan;

	Bird(String name, int weight, String faveFood) {
		super(name, weight, faveFood);
	}

	final String reproduce() {
		return "ovoviviparous";
	}

	boolean getFly() { return this.fly;	}
	void setFly(boolean fly) { this.fly = fly; }

	int getWingSpan() { return this.wingSpan; }
	void setWingSpan(int wing) { this.wingSpan = wing; }

}

abstract class Reptile extends Animal {
	final String bloodType = "cold-blooded";
	boolean hasScales;
	boolean hasLegs;
	
	Reptile(String name, int weight, String faveFood) {
		super(name, weight, faveFood);
	}

	final String reproduce(){
		return "eggs";
	};

	boolean getScales() { return this.hasScales; }
	void setScales(boolean scales) { this.hasScales = scales; }

	boolean getLegs() { return this.hasLegs; }
	void setLegs(boolean legs) { this.hasLegs = legs; }

}

final class Giraffe extends Mammal {
	double neckLength;
	int numSpots;

	Giraffe(String name, int weight, String faveFood, double neckLength, int numSpots){
		super(name, weight, faveFood);
		this.neckLength = neckLength;
		this.numSpots = numSpots;
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

	PrarieDog(String name, int weight, String faveFood, String tailColor, Boolean burrow) {
		super(name, weight, faveFood);
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
	final String foodType = foodTypeArray[0];
	double maxDive;
	Boolean bellySlide;

	Penguin(String name, int weight, String faveFood, double maxDive, Boolean bellySlide) {
		super(name, weight, faveFood);
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
	String foodType = foodTypeArray[1];

	Toucan(String name, int weight, String faveFood, double beakLength, double decibels) {
		super(name, weight, faveFood);
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
	final String foodType = foodTypeArray[0];

	Snake(String name, int weight, String faveFood, boolean venom, double length) {
		super(name, weight, faveFood);
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
	final String foodType = foodTypeArray[2];
	Turtle(String name, int weight, String faveFood, double circumference, boolean isAquatic) {
		super(name, weight, faveFood);
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
	int numAnimals[]={1,1,1,1,1,1};
	public void setupAnimals(){
		alist = new Animal[6];
		alist[0] = new Giraffe("Fred", 20, "acacia", 11.7, 24);
		alist[1] = new PrarieDog("Charlie", 15, "grass seeds", "black", true);
		alist[2] = new Penguin("Kowalski", 25, "Cheese Puffs", 20.6, true);
		alist[3] = new Toucan("Tookie", 8, "berries", 25.6, 40.6);
		alist[4] = new Snake("Salazar", 89, "mice", false, 20.5);
		alist[5] = new Turtle("Donatello", 206, "Cabbage", 50.7, false);
		System.out.println("\n");
		printSummaryView();
		printVerboseList();
	}
	
	void printSummaryView(){
		int totAnimals = alist.length;
		System.out.println("There are " + totAnimals + " animals in the zoo.");
		for(int i = 0; i < totAnimals; i++){
			System.out.println(numAnimals[i]+" " + alist[i].getClass().getSimpleName()+"(s)");
		}
	}
	int addAnimal(Animal a){return 1;}

  	int deleteAnimal(int index){return 1;}

  	void displayAnimals(String name) {}

	void printVerboseList(){
        int numAnimals = alist.length;
		System.out.println("   Name"+"\t\t\t"+"Species");
        for(int i = 0; i < numAnimals; i++){
            System.out.println((i+1) + ": " + alist[i].getName() + "\t\t" + alist[i].getClass().getSimpleName() + "\t\t"); // toString() needs to be defined for this to work correctly
        } // end for

	} // end of printVerboseList


  static String printInteractiveOptions(){return "placeholder";}


	public static void main(String[] args) {
		ZooSystem newZoo = new ZooSystem();
		newZoo.setupAnimals();

	}

}

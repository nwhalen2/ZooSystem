abstract class Animal{ 

	String name;
	int weight;
	String foodType;
	String bloodType;

	// constructor
	Animal(String name, int weight, String food, String blood) {
		this.name = name;
		this.weight = weight;
		this.foodType = food;
		this.bloodType = blood;
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

class Mammal extends Animal {

	Mammal(String name, int weight, String food, String blood) {
		super(name, weight, food, blood);
	}

	String reproduce() {
		return "vivaparous";
	}
	
//	abstract String eat();

	String complexBrain() {
		return "has a complex brain";
	}

}

class Bird extends Animal {

	boolean fly;
	int wingSpan;

	Bird(String name, int weight, String food, String blood) {
		super(name, weight, food, blood);
	}

	String reproduce() {
		return "ovoviviparous";
	}

//	abstract String eat();

	boolean getFly() { return this.fly;	}
	void setFly(boolean fly) { this.fly = fly; }

	int getWingSpan() { return this.wingSpan; }
	void setWingSpan(int wing) { this.wingSpan = wing; }

}

class Reptile extends Animal {

	boolean hasScales;
	boolean hasLegs;
	
	Reptile(String name, int weight, String food, String blood) {
		super(name, weight, food, blood);
	}
/*
	abstract String reproduce();
	abstract String eat();
*/
	boolean getScales() { return this.hasScales; }
	void setScales(boolean scales) { this.hasScales = scales; }

	boolean getLegs() { return this.hasLegs; }
	void setLegs(boolean legs) { this.hasLegs = legs; }

}

public class ZooSystem {

	public static void main(String[] args) {
		Reptile r1 = new Reptile("fred", 60, "omnivore", "cold-blooded");
		System.out.println(r1.getName() + " weighs " + r1.getWeight());
	}

}

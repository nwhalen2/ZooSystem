public abstract class Mammal extends Animal {
	final String bloodType = "warm-blooded";
	final String foodType = foodTypeArray[1];
	Mammal(String name, int weight, String faveFood) {
		super(name, weight, faveFood);
	}

	Mammal(String name){
		super(name);
	}

	final String reproduce() {
		return "vivaparous";
	}

	String complexBrain() {
		return "has a complex brain";
	}

}
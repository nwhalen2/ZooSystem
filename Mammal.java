public abstract class Mammal extends Animal {
	final String bloodType = "warm-blooded";
	final String foodType = foodTypeArray[1];
	Boolean canSwim;

	Mammal(String name, int weight, String faveFood) {
		super(name, weight, faveFood);
	}

	Mammal(String name){
		super(name);
	}

	final String reproduce() {
		return "viviparous";
	}

	Boolean getSwim() { return this.canSwim; }
	void setSwim(Boolean canSwim) { this.canSwim = canSwim; }

}

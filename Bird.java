public abstract class Bird extends Animal {
	final String bloodType = "warm-blooded";
	boolean fly;
	int wingSpan;

	Bird(String name, int weight, String faveFood) {
		super(name, weight, faveFood);
	}

	Bird(String name){
		super(name);
	}


	final String reproduce() {
		return "ovoviviparous";
	}

	boolean getFly() { return this.fly;	}
	void setFly(boolean fly) { this.fly = fly; }

	int getWingSpan() { return this.wingSpan; }
	void setWingSpan(int wing) { this.wingSpan = wing; }

}
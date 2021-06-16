public abstract class Reptile extends Animal {
	final String bloodType = "cold-blooded";
	boolean hasScales;
	boolean hasLegs;
	
	Reptile(String name, int weight, String faveFood) {
		super(name, weight, faveFood);
	}

	Reptile(String name){
		super(name);
	}
	final String reproduce(){
		return "ovoviviparous";
	};

	boolean getScales() { return this.hasScales; }
	void setScales(boolean scales) { this.hasScales = scales; }

	boolean getLegs() { return this.hasLegs; }
	void setLegs(boolean legs) { this.hasLegs = legs; }

}

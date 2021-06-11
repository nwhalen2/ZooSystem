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

	abstract reproduce() {}

	String getName() { return this.name; }
	void setName(String name) { this.name = name; }

	int getWeight() { return this.weight; }
	void setWeight(int weight) { this.weight = weight; }

	String getFoodType() { return this.foodType; }
	void setFoodType(String food) { this.foodType = food; } 

	String getBloodType() { return this.foodType; }
	void setBloodType(String blood) { this.foodType = food; }	

}

public abstract class Animal{ 

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

	Animal(String name){
		this.name = name;
	}
	abstract String eat();
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
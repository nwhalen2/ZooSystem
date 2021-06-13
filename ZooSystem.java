import java.util.Scanner;
import java.util.Arrays;
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

abstract class Mammal extends Animal {
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

abstract class Bird extends Animal {
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

abstract class Reptile extends Animal {
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
	Giraffe(String name, double neckLength){
		super(name);
		this.neckLength = neckLength;
	}
	String eat(){
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
final class PrarieDog extends Mammal {
	String tailColor;
	Boolean burrow;

	PrarieDog(String name, int weight, String faveFood, String tailColor, Boolean burrow) {
		super(name, weight, faveFood);
		this.tailColor = tailColor;
		this.burrow = burrow;
	}

	PrarieDog(String name, String tailColor){
		super(name);
		this.tailColor = tailColor;
	}

	String eat(){return "prarie grass seeds";}
	String getTailColor(){ return this.tailColor; }
	void setTailColor(String tailColor) {this.tailColor = tailColor; }
	Boolean getBurrow() {return this.burrow;}
	void setBurrow(Boolean burrow){this.burrow = burrow;}
	public String toString(){
		return this.name + " the " + this.getClass().getSimpleName() + " has a " + this.tailColor + " colored tail.";
	}

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
	Penguin(String name, double maxDive){
		super(name);
		this.maxDive = maxDive;
	}
	String eat(){
		return "fish";
	}
	double getMaxDive(){return this.maxDive;}
	void setMaxDive(double maxDive){this.maxDive = maxDive;}
	Boolean getBellySlide(){return this.bellySlide;}
	void setBellySlide(Boolean bellySlide){this.bellySlide = bellySlide;}
	public String toString(){
		return this.name + " the " + this.getClass().getSimpleName() + " can dive up to " + this.maxDive + " feet.";
	}
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

	Toucan(String name, double beakLength){
		super(name);
		this.beakLength = beakLength;
	}

	String eat(){
		return "fruits and berries";
	}

	double getBeakLength(){return this.beakLength;}
	void setBeakLength(double beakLength){this.beakLength = beakLength;}
	double getDecibels(){return this.decibels;}
	void setDecibels(double decibels){this.decibels = decibels;}
	public String toString(){
		return this.name + " the " + this.getClass().getSimpleName() + " has a beak " + this.beakLength + " inches long.";
	}
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

	Snake(String name, double length){
		super(name);
		this.length = length;
	}
	String eat(){
		return "mice";
	}

	boolean getVenom(){return this.venom;}
	void setVenom(boolean venom){this.venom = venom;}
	double getLength(){return this.length;}
	void setLength(double length){this.length = length;}
	public String toString(){
		return this.name + " the " + this.getClass().getSimpleName() + " is " + this.length + " feet long.";
	}
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

	Turtle(String name, double circumference){
		super(name);
		this.circumference = circumference;
	}
	String eat(){
		return "lettuce";
	}
	double getCircumference(){return this.circumference;}
	void setCircumference(double circumference){this.circumference = circumference;}
	boolean isAquatic(){return this.isAquatic;}
	void isAquatic(boolean isAquatic){this.isAquatic = isAquatic;}
	public String toString(){
		return this.name + " the " + this.getClass().getSimpleName() + " has a shell that is " + this.circumference + " inches in circumference.";
	}
}

public class ZooSystem {
	Animal alist[];
	int numAnimals[]={1,1,1,1,1,1};
	String animalTypes[] = {"giraffe", "prariedog", "penguin", "toucan", "snake", "turtle"};
	public void setupAnimals(){
		alist = new Animal[6];
		alist[0] = new Giraffe("Teddy", 20, "acacia", 11.7, 24);
		alist[1] = new PrarieDog("Charlie", 15, "grass seeds", "black", true);
		alist[2] = new Penguin("Kowalski", 25, "Cheese Puffs", 20.6, true);
		alist[3] = new Toucan("Samuel", 8, "Froot Loops", 25.6, 40.6);
		alist[4] = new Snake("Salazar", 89, "mice", false, 20.5);
		alist[5] = new Turtle("Donatello", 206, "Pizza", 50.7, false);
		System.out.println("\n");
		printSummaryView();
		System.out.println("\n");
		printVerboseList();
	}
	
	void printSummaryView(){
		int totAnimals = alist.length;
		System.out.println("There are " + totAnimals + " animals in the zoo.");
		for(int i = 0; i < animalTypes.length; i++){
			System.out.println(numAnimals[i]+" " + animalTypes[i]+"(s)");
		}
	}
	void addAnimal(Scanner input){
		System.out.println("What type of animal would you like to add? (format: species name specialTrait)");
		String userDecision = input.next();
		String[] words = userDecision.split("\\s+");
		if(words.length != 3){
			System.out.println("\nToo few/many arguments.");
			return;
		}
		//Need to find an easier way to turn the user's first word (species) into call for constructor to reduce eyesore
		for(int i = 0; i < animalTypes.length; i++){
			if((words[0].toLowerCase()).equals(animalTypes[i])){
				alist = Arrays.copyOf(alist, alist.length + 1);
				numAnimals[i] += 1;
      			if(words[0].toLowerCase().equals(animalTypes[0])){
					alist[alist.length-1] = new Giraffe(words[1], Double.parseDouble(words[2]));
				}else if(words[0].toLowerCase().equals(animalTypes[1])){
					alist[alist.length-1] = new PrarieDog(words[1], words[2]);
				}else if(words[0].toLowerCase().equals(animalTypes[2])){
					alist[alist.length-1] = new Penguin(words[1], Double.parseDouble(words[2]));
				}else if(words[0].toLowerCase().equals(animalTypes[3])){
					alist[alist.length-1] = new Toucan(words[1], Double.parseDouble(words[2]));
				}else if(words[0].toLowerCase().equals(animalTypes[4])){
					alist[alist.length-1] = new Snake(words[1], Double.parseDouble(words[2]));
				}else if(words[0].toLowerCase().equals(animalTypes[5])){
					alist[alist.length-1] = new Turtle(words[1], Double.parseDouble(words[2]));
				}
				displayAnimalInformation(alist[alist.length-1]);
				return;
			}
		}
		System.out.println("\nSorry; such a species isn't supported at the zoo");
	}

	static void displayAnimalInformation(Animal userCreatedAnimal){
		System.out.println("\nName: "+ userCreatedAnimal.getName());
		System.out.println("Species: " + userCreatedAnimal.getClass().getSimpleName());
		System.out.println("Reproductive Type: "+ userCreatedAnimal.reproduce());
		System.out.println("Eating Habits: " + userCreatedAnimal.eat() + "\n");
	}

  	void deleteAnimal(Scanner input){
		System.out.println("What is the name of animal would you like to wipe from existence?");
		String userDecision = input.next();
		//Need to find an easier way to turn the user's first word (species) into call for constructor to reduce eyesore
		//loop through the list to find the animal with name match
		for(int i = 0; i < alist.length; i++){
			if((userDecision.toLowerCase()).equals(alist[i].getName().toLowerCase())){
				//loop through animal types to decrement the number of that species
				for(int j = 0; j < animalTypes.length; j++){
					if(alist[i].getClass().getSimpleName().toLowerCase().equals(animalTypes[j])){
						numAnimals[j] -= 1;
					}
				}
				//Delete the animal from the array
				Animal[] tempArray = new Animal[alist.length - 1];
				for (int k = 0, m = 0; k < alist.length; k++){
					if (k == i){
						continue;
					}
					tempArray[m++] = alist[k];
				}
				alist = tempArray;
				System.out.println(userDecision + " disappeared from the zoo with a poof!");
				return;
			}
		}
		System.out.println("Sorry, "+ userDecision + " isn't in the zoo.");
	}
	//Inpiration for code taken from https://www.geeksforgeeks.org/remove-an-element-at-specific-index-from-an-array-in-java/
	void removeElement(Animal[]tempArray){
		
	}
  	void displayAnimal(Scanner input) {
		int numAnimals = alist.length;
		System.out.println("What animal would you like to display information about?");
		String userDecision = input.next();
		for(int i = 0; i < numAnimals; i++){
			if(userDecision.equals(alist[i].getName())){
				System.out.println("\n"+ alist[i]);
				return;
			}
		}
		System.out.println("Sorry, " + userDecision + " is not an animal at this zoo.") ;
	}

	void printVerboseList(){
        int numAnimals = alist.length;
		System.out.println("   Name"+"\t\t\t"+"Species");
		//NOTE: PrarieDog is too long a species name (and names must be at least 5 characters long)
        for(int i = 0; i < numAnimals; i++){
            System.out.println((i+1) + ": " + alist[i].getName() + "\t\t" + alist[i].getClass().getSimpleName() + "\t\t" + alist[i]); // toString() needs to be defined for this to work correctly
        } // end for

	}

    static int printInteractiveOptions(Scanner input){
		System.out.println("Options:\n Add animal(add)\n Delete animal(delete)\n Display animal(display)\n Quit program (quit) \n");
		input.useDelimiter(System.lineSeparator());
		String userDecision = input.next();
		if(userDecision.equals("add")){
			return 0;
		}else if(userDecision.equals("delete")){
			return 1;
		}else if(userDecision.equals("display")){
			return 2;
		}else if(userDecision.equals("quit")){
			return 3;
		}else{
			System.out.println("Invalid output. Please try again");
			return 4;
		}
	}


	public static void main(String[] args) {
		boolean runProgram = true;
		Scanner input = new Scanner(System.in);
		int output;
		ZooSystem newZoo = new ZooSystem();
		newZoo.setupAnimals();
		while(runProgram){
			output = printInteractiveOptions(input);
			if(output == 0){
				newZoo.addAnimal(input);
			}else if (output == 1){
				newZoo.deleteAnimal(input);
			}else if (output == 2){
				newZoo.displayAnimal(input);
			}else if (output == 3){
				runProgram = false;
				input.close();
			}
			System.out.println("\n");
			newZoo.printSummaryView();
			System.out.println("\n");
			newZoo.printVerboseList();
			System.out.println("\n");
		}
	}
}

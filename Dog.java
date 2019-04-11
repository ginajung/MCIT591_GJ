		
/**
 * A constructor that looks like this:
 * public Dog(String name, String breed)
 * The default weight of a dog is 125 g. 
 * The age of a dog upon creation (calling the constructor)should be set to 0.
 * getter for Breed, name, age, weight
 * 
 * 'Eat' method increases the weight of the dog by 0.1 g
 * 'rename(String newName)​ – change the name of the dog
 *  ' hasBirthday()​ ' does  two things:
 * 1. It prints out ”happy birthday”
 * 2. It increments the age of the dog by 1	
 * @author Gina Jung
 *
 */

public class Dog {
	// instant variables
	String name;
	String breed;
	int age=0;
	double weight=125;
	
	
	// Add a constructor
	public Dog(String name, String breed) {
		this.name=name;
		this.breed=breed;
	}
	// Add getter for each variable
	public String getName() {
		return name;
	}

	public String getBreed() {
		return breed;
	}

	public int getAge() {
		return age;
	}

	public double getWeight() {
		return weight;
	}
	
	
	public void eat () { 
		weight=weight+0.1;
	}		
	
	public void rename(String newName){
		name=newName;
	}
	
	public void hasBirthday() {
		age=age+1;
		System.out.println("happy birthday");
		
		}

	
}


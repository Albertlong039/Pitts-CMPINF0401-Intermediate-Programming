import java.util.*;
public class Fleet{
	
	public static void main(String[] args){
		Vehicle car1 = new Vehicle(); //Using base constructor, just makes a Vehicle object for us to use and nothing else
		car1.setModel("Mustang");
		car1.setWeight(2900);
		car1.setColor("Silver");
		car1.setYear(2020);
		car1.setMPG(27.8);
		car1.stats();
		
		//Lets test out data hiding logic, lets make another Vehicle object
		
		Vehicle car2 = new Vehicle("Mustang",2750,"Blue",30.0,2021); //Using Overload Constructor so we can create AND define our object in 1 simpler line
		car2.stats();
		
		ArrayList<Vehicle> cars = new ArrayList<Vehicle>(); // create an arraylist of our objects we create from the Vehicle class
		// Each vehicle with ALL of its methods and datafields will be stored in each element of our arraylist. Remember an ArrayList stores every value as an object instead of a primitive like a normal array
		
		cars.add(car1);
		cars.add(car2);
		for(Vehicle car : cars)
		{
			car.stats();
		}
		
		
		// You can see how 2 constructors work to do the same thing but in 2 different ways
		
		
		
		
	}
	
	
	
}
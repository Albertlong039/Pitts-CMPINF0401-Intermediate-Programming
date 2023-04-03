public class Vehicle {
	//these variables are part of the public class itself, they are PUBLIC to the program constructing an object from this class directly
	String model = "";
	int weight = 0;
	String color = "";
	double mpg = 0.0;
	int year = 0000;
	
	public void stats(){
		System.out.println("Vehicle model name: " + model);
		System.out.println("Vehicle model year: " + year);
		System.out.println("Vehicle weight is: " + weight);
		System.out.println("Vehicle color is: " + color);
		System.out.println("Vehicle EPA rated MPG: " + mpg);
		
	}
	
	
	
	
	
	
}
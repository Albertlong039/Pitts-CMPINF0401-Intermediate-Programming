public class Bus extends Vehicle {
	private int seating;

	public void setSeating(int in){
		seating = in;
	}

	public int getSeating(){
		return seating;
	}

	//The parent class also has an identically named method, this method used in this subclass will OVERRIDE its parents stats() method when called from an object of this subclass.
	//This is polymorphism(many shapes)
	public void stats(){
    System.out.println("Vehicle type is: " + getVclass());
    System.out.println("Vehicle is made by: " + getMake());
    System.out.println("Vehicle model name: " + getModel());
    System.out.println("Vehicle weight is: " + getWeight());
    System.out.println("Vehicle color is: " + getColor());
    System.out.println("Vehicle model year: " + getYear());
    System.out.println("Vehicle EPA rated MPG: " + getMPG());
    System.out.println("Vehicle seating capacity: " + seating);
	}


}

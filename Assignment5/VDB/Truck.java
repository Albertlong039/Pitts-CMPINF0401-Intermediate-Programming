public class Truck extends Vehicle {
	private int seating;
	private int hauling;

	public void setSeating(int in){
		seating = in;
	}

	public int getSeating(){
		return seating;
	}
	public void setHauling(int in){
		seating = in;
	}

	public int getHauling(){
		return hauling;
	}


	public void stats(){
		System.out.println("Vehicle type is: " + getVclass());
		System.out.println("Vehicle is made by: " + getMake());
		System.out.println("Vehicle model name: " + getModel());
		System.out.println("Vehicle weight is: " + getWeight());
		System.out.println("Vehicle color is: " + getColor());
		System.out.println("Vehicle model year: " + getYear());
		System.out.println("Vehicle EPA rated MPG: " + getMPG());
		System.out.println("Vehicle seating capacity: " + seating);
		System.out.println("Vehicle hauling capacity: " + hauling);

	}


}

public class Motorcycle extends Vehicle {
	private int weight;
	public  void setWeight(int in){
		weight = in;
	}
    
	public  int getWeight(){
		return weight;
	}
	
	public void stats(){
		System.out.println("Vehicle model name: " + getModel());
		System.out.println("Vehicle model year: " + getYear());
		System.out.println("Vehicle weight is: " + weight);
		System.out.println("Vehicle color is: " + getColor());
		System.out.println("Vehicle EPA rated MPG: " + getMPG());
		System.out.println("Vehicle is made by: " + getMake());	
		
	}
	
	
}
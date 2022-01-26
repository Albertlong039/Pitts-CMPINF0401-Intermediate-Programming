import java.util.*;
public class Fleet{
	
	public static void main(String[] args){
		Scanner kbd = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		ArrayList<Vehicle> cars = new ArrayList<Vehicle>();
		System.out.println("how many cars do you intend to enter?");
		int count = kbd.nextInt();
		while(count>0){
		    System.out.println("What type of vehicle are you entering? (1: Car, 2: Truck, 3: Motorcycle)");
			int type = kbd.nextInt();
			if (type == 1){
				Car car = new Car();
				System.out.println("What is the model?");
				car.setModel(input.next());
				System.out.println("What is the weight?");
				car.setWeight(input.nextInt());
				System.out.println("What is the color?");
				car.setColor(input.next());
				System.out.println("What is the year?");
				car.setYear(input.nextInt());
				System.out.println("What is the MPG?");
				car.setMPG(input.nextDouble());
				System.out.println("What is the make?");
				car.setMake(input.next());
				System.out.println("What is the seating?");
				car.setSeating(input.nextInt());
				cars.add(car);
			}
			else if (type == 2){
				Truck truck = new Truck();
				System.out.println("What is the model?");
				truck.setModel(input.next());
				System.out.println("What is the weight?");
				truck.setWeight(input.nextInt());
				System.out.println("What is the color?");
				truck.setColor(input.next());
				System.out.println("What is the year?");
				truck.setYear(input.nextInt());
				System.out.println("What is the MPG?");
				truck.setMPG(input.nextDouble());
				System.out.println("What is the make?");
				truck.setMake(input.next());
				System.out.println("What is the seating?");
				truck.setSeating(input.nextInt());
				System.out.println("What is the hauling?");
			    truck.setHauling(input.nextInt());
				cars.add(truck);
			}
			else{
				Motorcycle motorcycle = new Motorcycle();
				System.out.println("What is the model?");
				motorcycle.setModel(input.next());
				System.out.println("What is the weight?");
				motorcycle.setWeight(input.nextInt());
				System.out.println("What is the color?");
				motorcycle.setColor(input.next());
				System.out.println("What is the year?");
				motorcycle.setYear(input.nextInt());
				System.out.println("What is the MPG?");
				motorcycle.setMPG(input.nextDouble());
				System.out.println("What is the make?");
				motorcycle.setMake(input.next());
				cars.add(motorcycle);
			}
			count--;
		}
		System.out.println("Now we will go through all objects created from the superclass Vehicle");
		for(Vehicle car : cars)
		{
			car.stats();
		}
		
		
	}
	
	
	
}
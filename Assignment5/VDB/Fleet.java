import java.util.*;
import java.util.Scanner;
import java.io.*; // needed for file access
public class Fleet{

	public static void main(String[] args) throws Exception{
		Scanner input = new Scanner(System.in);
		System.out.println("What's the name of your DB ?");
		String db =input.next()+".txt";
		Scanner DBread = new Scanner(new File(db));
		ArrayList<Vehicle> cars = new ArrayList<Vehicle>();
		while (DBread.hasNext()) {
			String VC = DBread.next();
			if (VC.equals("C")){
				Car car = new Car();
				car.setMake(DBread.next());

				car.setModel(DBread.next());

				car.setWeight(DBread.nextInt());

				car.setColor(DBread.next());

				car.setYear(DBread.nextInt());

				car.setMPG(DBread.nextDouble());

				car.setSeating(DBread.nextInt());

				car.setVclass("C");
				cars.add(car);
			}
			else if (VC.equals("T")){
				Truck truck = new Truck();

				truck.setMake(DBread.next());

				truck.setModel(DBread.next());

				truck.setWeight(DBread.nextInt());

				truck.setColor(DBread.next());

				truck.setYear(DBread.nextInt());

				truck.setMPG(DBread.nextDouble());

				truck.setSeating(DBread.nextInt());

			  truck.setHauling(DBread.nextInt());

				truck.setVclass("T");
				cars.add(truck);
			}
			else if (VC.equals("MC")){
				Motorcycle motorcycle = new Motorcycle();

				motorcycle.setMake(DBread.next());

				motorcycle.setModel(DBread.next());

				motorcycle.setWeight(DBread.nextInt());

				motorcycle.setColor(DBread.next());

				motorcycle.setYear(DBread.nextInt());

				motorcycle.setMPG(DBread.nextDouble());

				motorcycle.setVclass("MC");
				cars.add(motorcycle);
			}
			else if (VC.equals("B")){
				Bus bus = new Bus();

				bus.setMake(DBread.next());

				bus.setModel(DBread.next());

				bus.setWeight(DBread.nextInt());

				bus.setColor(DBread.next());

				bus.setYear(DBread.nextInt());

				bus.setMPG(DBread.nextDouble());

				bus.setSeating(DBread.nextInt());

				bus.setVclass("B");
				cars.add(bus);
			}
			else{
				CT ct = new CT();

				ct.setMake(DBread.next());

				ct.setModel(DBread.next());

				ct.setWeight(DBread.nextInt());

				ct.setColor(DBread.next());

				ct.setYear(DBread.nextInt());

				ct.setMPG(DBread.nextDouble());

				ct.setSeating(DBread.nextInt());

			  ct.setHauling(DBread.nextInt());

				ct.setiscombination(DBread.nextBoolean());

				ct.setVclass("CT");
				cars.add(ct);
			}

		}
		System.out.println("What vehicle class would you like to list?(C: Car, T: Truck, MC: Motorcycle, B: Bus, CT: Commercial Truck)");
		String search = input.next();
		int count=0;
		for(Vehicle car : cars)
		{
			String v1 =car.getVclass();
			if (v1.equals(search)){
			car.stats();
			count++;}
		}
		System.out.println( count + " vehicles of the " + search + " class have been found and returned by your search");

	}



}

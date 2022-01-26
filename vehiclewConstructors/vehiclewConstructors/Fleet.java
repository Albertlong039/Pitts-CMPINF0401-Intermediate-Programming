import java.util.Scanner;
public class Fleet{
	
	public static void main(String[] args){
		Vehicle car1 = new Vehicle(); //Using base constructor, just makes a Vehicle object for us to use and nothing else
	    Scanner kbd = new Scanner(System.in);
	    String Model;
		int Weight;
		String Color;
		int Year;
		Double MPG;
		String make;
	    System.out.println("model?");
		Model=kbd.next();
		System.out.println("weight?");
		Weight=kbd.nextInt();
		System.out.println("color?");
		Color=kbd.next();
		System.out.println("year?");
		Year=kbd.nextInt();
        System.out.println("MPG?");
		MPG=kbd.nextDouble();
		System.out.println("make?");
		make=kbd.next();
		
	    car1.setModel(Model);
		car1.setWeight(Weight);
		car1.setColor(Color);
		car1.setYear(Year);
		car1.setMPG(MPG);
		car1.setMake(make);
		car1.stats();
		
		//Lets test out data hiding logic, lets make another Vehicle object
		
		System.out.println("model?");
		Model=kbd.next();
		System.out.println("weight?");
		Weight=kbd.nextInt();
		System.out.println("color?");
		Color=kbd.next();
		System.out.println("MPG?");
		MPG=kbd.nextDouble();
		System.out.println("year?");
		Year=kbd.nextInt();
		System.out.println("make?");
		make=kbd.next();
		Vehicle car2 = new Vehicle(Model,Weight,Color,MPG,Year,make); //Using Overload Constructor so we can create AND define our object in 1 simpler line
		
		car2.stats();
		
		// You can see how 2 constructors work to do the same thing but in 2 different ways
		
		// You can see how 2 constructors work to do the same thing but in 2 different ways
		
		
		
		
	}
	
	
	
}
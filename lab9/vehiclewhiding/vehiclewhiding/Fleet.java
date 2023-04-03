public class Fleet{
	
	public static void main(String[] args){
		Vehicle car1 = new Vehicle(); // create an OBJECT instance of our Vehicle class
		car1.setModel("Mustang");
		car1.setWeight(2900);
		car1.setColor("Silver");
		car1.setYear(2020);
		car1.setMPG(27.8);
		car1.stats();
		
		//Lets test out data hiding logic, lets make another Vehicle object
		Vehicle car2 = new Vehicle();
		car2.setModel("Mustang");
		car2.setWeight(900);
		car2.setColor("Blue");
		car2.setYear(1929);
		car2.setMPG(27.8);
		car2.stats();
		// notice weight and year are invalid? Lets fix it
		car2.setWeight(2750);
		car2.setYear(2021);
		car2.stats();
		//notes for the vehicle are unchanged as we never reset it.
		
		//Lets try some tests using data from the getter methods
		String m1,m2;
		m1 = car1.getModel();
		m2 = car2.getModel();
		System.out.println("Model of car1 is: " + m1);
		System.out.println("Model of car2 is: " + m2);
		if (m1 == m2) //this wont work for strings
		{
			System.out.println("These 2 cars are the same model");
		}
		if (m1.equals(m2))
		{
			System.out.println("These 2 cars are the same model");
		}
		
		
	}
	
	
	
}
public class Vehicle {
	//these variables are part of the public class itself but are PRIVATE meaning they cant be directly seen or accessed by a program making a Vehicle object, they are using "data hiding"
	// to access or set these we will need to make an INTERFACE to the class, ie public methods to get and set them - java calls this practice "getters and setters"
	private String model = "";
	private int weight = 0;
	private String color = "";
	private double mpg = 0.0;
	private int year = 0000;
	private String notes = "System notes: \n";
	
	public  void setModel(String in){
		//setter methods usually are VOID datatype as they only act to take in a value without giving anything back
		// what if I need to make sure model names are stored as uppercase only? If I make the data fields public I cant enforce a rule like that. By hiding the data and using an interface i can
		model = in.toUpperCase();
	}
	
	public  String getModel(){
		//getters datatype for the method needs to match the datatype of the field it will return
		//notice it isnt taking IN any parameters? It doesnt need to for this case
		return model;
		
	}
	
	public  void setWeight(int in){
		// enforce a rule that a weight below 1000 is invalid and notify through the 'notes' field above the weight entered was invalid
		if (in < 1000)
		{
			notes += "The user entered an invalid weight of " + in + " as a weight \n";
		}
		weight = in;
		
		
	}
	public  int getWeight(){
		return weight;
	}
	public  void setColor(String in){
		color = in;
	}
	public  String getColor(){
		return color;
	}
	
	public  void setYear(int in){
		//make sure year isnt prior to 1930 or notify in notes an invalid year was entered
		if (in < 1930)
		{
			notes += "The user entered an invalid year of " + in +  " for vehicle model year\n";
		}
		year = in;
		
	}
	public  int getYear(){
		return year;
	}
	public  void setMPG(double in){
		mpg = in;
	}
	public  double getMPG(){
		return mpg;
	}
	
	
	public void stats(){
		System.out.println("Vehicle model name: " + model);
		System.out.println("Vehicle model year: " + year);
		System.out.println("Vehicle weight is: " + weight);
		System.out.println("Vehicle color is: " + color);
		System.out.println("Vehicle EPA rated MPG: " + mpg);
		System.out.println(notes);
		
		
	}
	
	
	
	
	
	
}
import java.util.HashMap;
import java.util.Scanner;
public class bonus {
  public static void main(String[] args) {
    // Create a HashMap object called capitalCities
    HashMap<String, String> capitalCities = new HashMap<String, String>();
	Scanner keyboard = new Scanner(System.in);
	
    capitalCities.put("FTL-5101", "Big Chungus");
    capitalCities.put("LOL-1337", "Elon Musk");
    capitalCities.put("TMP-5309", "Jenny");
    capitalCities.put("CVD-2021", "Persona non grata");
	capitalCities.put("SPR-SPRD", "Persona non grata Jr");
    
	System.out.println("The plate, please! ie ABC-1234");
	String plate= keyboard.next();  
    plate= plate.toUpperCase();
    
    
    if (capitalCities.get(plate) != null )  // A search for a non present key will return a 'null'
        System.out.println("The plate has matched to: " + capitalCities.get(plate));
    else
        System.out.println("The owner is unknown");
	
	
  }
}
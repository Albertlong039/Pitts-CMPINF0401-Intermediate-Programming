import java.util.HashMap;

public class HashData {
  public static void main(String[] args) {
    // Create a HashMap object called capitalCities
    HashMap<String, String> capitalCities = new HashMap<String, String>();

    // Add keys and values (Country, City)
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    System.out.println(capitalCities);  //Print out whole set
    System.out.println("The size of the hashmap is: " + capitalCities.size()); //Show how many sets we have stored
    // Print keys
    for (String i : capitalCities.keySet()) {
        System.out.println(i);
    
    }
    
    // Print values
    for (String i : capitalCities.values()) {
        System.out.println(i);
    }
    System.out.println(capitalCities.get("England")); // Pull the 'value' associated with a 'key'

    capitalCities.remove("England"); //Remove a member of the set
    
    System.out.println(capitalCities); // Print out set to confirm it was removed
    
    System.out.println("The size of the hashmap is: " + capitalCities.size()); //Verify new size
    
    if (capitalCities.get("Japan") != null )  // A search for a non present key will return a 'null'
        System.out.println("Japan has matched to: " + capitalCities.get("Japan"));
    else
        System.out.println("Japan has not been found in set!");
    
    capitalCities.put("Japan", "Tokyo"); // Lets add Japan to the set
    if (capitalCities.get("Japan") != null )  // Run the same search now
        System.out.println("Japan has matched to: " + capitalCities.get("Japan"));
    else
        System.out.println("Japan has not been found in set!");
  }
}
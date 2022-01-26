import java.util.*;
import java.io.*;
public class ALRemove {
    public static void main(String args[]) {
      ArrayList<Integer> wordList= new ArrayList<Integer>();
      wordList.add(2); // Load up the arraylist
      wordList.add(12);
      wordList.add(22);
      wordList.add(26);
      wordList.add(26);
      wordList.add(29);
      wordList.add(24);
      wordList.add(26);
      //Lets remove ALL copies of 26 from the ArrayList
      System.out.println("The length of the arraylist is: " +  wordList.size());
      printArrayList(wordList);
      int firstaddy = wordList.indexOf(26); // will find the FIRST location from the left of the target value
      wordList.remove(firstaddy);
      int lastaddy = wordList.lastIndexOf(26); // will find the LAST location by searching from the right hand side.
      wordList.remove(lastaddy);
      // So now we are searching from the left and right
      // ArrayList looks like this in memory   indexOf==> 2 12 22 26 26 29 24 26 <== lastIndexOf
      printArrayList(wordList);
      //notice there is still a 26 there? We didnt get all of them 
      
      
      
      
    }
    
    static void printArrayList( ArrayList<Integer> array  )
    {
        for ( int number : array ) 
            System.out.println( number);
        System.out.println();
    }
}
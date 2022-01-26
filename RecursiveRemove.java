import java.util.*;
import java.io.*;
public class RecursiveRemove {
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
      
      printArrayList(wordList);
      remover(wordList,26);
      printArrayList(wordList);
      
      
    }
    static void remover(ArrayList<Integer> array, int target)
    {
        
        int loc = array.indexOf(target); //find the target
        array.remove(loc); //remove it!
        if (array.indexOf(target) != -1) // test to determine if any targets remain in the list, if they are we recursively call remover again (loop logic without a loop)
        {
            remover(array,target);
        }
    }
    static void printArrayList( ArrayList<Integer> array  )
    {
        for ( int number : array ) 
            System.out.println( number);
        System.out.println();
    }
}
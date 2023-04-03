import java.util.*;
import java.io.*;
public class ALLoopRemove {
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
        int isthere = array.indexOf(target); //is the target in the list? if not, -1 will be returned
        while (isthere != -1) //anything other than -1 means the target IS in the list, it needs to be removed
        {
            int loc = array.indexOf(target); //find the target
            array.remove(loc); //remove it!
            isthere = array.indexOf(target);//search the arraylist again and determine if any copies remain, also serves to control the loop to prevent a non existing removal attempt
        }
    }
    static void printArrayList( ArrayList<Integer> array  )
    {
        for ( int number : array ) 
            System.out.println( number);
        System.out.println();
    }
}
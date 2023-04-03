import java.util.*;
import java.io.*;
public class ArrayListDemo {
    public static void main(String args[]) {
      ArrayList<Integer> wordList= new ArrayList<Integer>();
      wordList.add(2); // Load up the arraylist
      wordList.add(12);
      wordList.add(22);
      wordList.add(26);
      wordList.add(29);
      wordList.add(24);

      System.out.println("The length of the arraylist is: " +  wordList.size());
      for (int word : wordList)
      {
          System.out.println(word);
      }
      int addytoremove = wordList.indexOf(22);
      System.out.println("The index of 22 is " + addytoremove);
      System.out.println("That value will now be removed");
      wordList.remove(addytoremove);
      for (int word : wordList)
      {
          System.out.println(word);
      }
      System.out.println("The length of the arraylist is: " +  wordList.size());
    }
}
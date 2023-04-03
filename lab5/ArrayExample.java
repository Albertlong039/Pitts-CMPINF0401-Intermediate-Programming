import java.io.*;
import java.util.Scanner;
import java.util.*;
import java.util.Arrays;
public class ArrayExample {
    public static void main(String args[]) {
      int myarray[] = new int[5];
      Scanner kbd = new Scanner (System.in);
      for(int i = 0; i < myarray.length ; i++)
        {
           System.out.print("Enter an int:");
           myarray[i] = kbd.nextInt();  
        }
        for(int i = 0; i < myarray.length ; i++)
        {
           System.out.println("Value stored at index " + i + " is " + myarray[i]);
           
        }

      
    } //end main
}// end of class(program)
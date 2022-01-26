import java.util.*;
import java.io.*;
public class Lab8 {
    public static void main(String args[]) {
      
      Scanner kbd = new Scanner(System.in);
      System.out.print("Enter a number to factor:");
      int factorialvalue = 1; //initialize as 1 because null will 0 out anything after it
      int n = kbd.nextInt(); //pull in number to factorialize
      int start = n; // since n will count down we want to remember where it started
      // do not modify code above
      
      //Replace the loop below with a method call NOT using a loop but only recursion to solve the problem
      
	  
	  factorialvalue = factorial(n,factorialvalue);
      System.out.println("The final value of " + start + "! factorial is " + factorialvalue); //Leave this here
      
      
    }
    static int factorial(int n, int factorialvalue)
    {
        
         if (n < 0) 
      {
         return 0; 
      }
		else if(n>1)
      {
		 factorialvalue *= n; // if n was initially 3, 3*1=3 -- 3*2*1= 6
         System.out.println("Current n value is: " + n );
		 n--;
  		 return factorial(n,factorialvalue);
      }
	  else
		  return factorialvalue;q1		 
    }   
    }
  
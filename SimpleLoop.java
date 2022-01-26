   import java.util.Scanner;
public class SimpleLoop {
    public static void main(String args[]) {
      Scanner kbd = new Scanner(System.in);
      System.out.print("How many loops would you like to run?");
      int limit = kbd.nextInt();
      int count = 0;
      while (count < limit)
      {
          System.out.println("All work and no play makes mike a dull boy");
          count +=1;
          
      }
      

      System.out.println("Loop is done");
    }
}
import java.util.Scanner; // import the Scanner class to gain access to make our Scanner object

public class KeyBoardInput {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in); // keyboard is now how we will prompt for input
    String userName;
    double income,taxdue;
    
    // Enter username and press Enter
    System.out.print("Enter your name:"); 
    userName = keyboard.nextLine(); //will pull in the entire line of text a user enters
    System.out.print("Enter income: ");
    income = keyboard.nextDouble(); //will draw in the next double value on the line the user typed
    taxdue = income * .1;
       
    System.out.println("Taxpayer name is: " + userName);  
    System.out.println("Their income was: " + income);
    System.out.println("Their tax amount due is: "+ taxdue);
  }
}
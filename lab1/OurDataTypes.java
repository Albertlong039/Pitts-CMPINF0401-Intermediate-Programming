public class OurDataTypes {
    public static void main(String args[]) {
      //lets make an int
      int x; //int can only hold a whole number, no decimals
      x = 10;
      System.out.println(x); // this will print to the command line whatever is inside x and drop the cursor to the next line
      System.out.print(x); // this will print whatever is in x but will NOT drop our cursor to the next newline
      //Now we will make another int variable so we can try some math
      int y = 4;
      System.out.println(x + y); // The math operation will be carried out and then output
      //Did you notice the answer of 14 seems to be stuck to the side of the previous output? Its because we used a print() instead of println()
      System.out.println(); // this will just drop our cursor to a new line
      int z = x * y; // math operation is done first, then resulting value sent into the z variable
      System.out.println(z);
      //lets work with doubles - these are numeric like ints but can allow decimal values
      double a = 10.4;
      double b = 12.1;
      System.out.println(a * b);
      //can we mix and match types? Well, yes. However, only in one direction. ints can be stored into a double, but doubles cant go into an int
      double c = x * y; // x and y are ints, they will have int multiplication. However will be stored as double
      System.out.println(c); // notice it outputs as 40.0 instead of 40?
      double d = x * b; // int * double, what will happen? Most accurate datatype will control the math operation, double multiplication = allowed
      //int zz = x * b; this is commented out as it will result in a compile error, x * b is int * double, double is more accurate meaning output of the math will 
      // be double, we are then trying to assign a double into an int. Java will catch this and complain of a "lossy conversion" as an int cant take any decimal, even .0
      
      // booleans can store only true or false
      boolean answer = false;
      System.out.println(answer);
      
      // strings hold values that arent numeric or boolean (words or special characters)
      String sentence = "Hello, this is my sentence"; // notice String is capitolized where other types arent. The value we wish to place in them must be between ""
      // we can use the + operator to join them with other strings, its not a math operator in this context
      System.out.println(sentence + " and Im sticking to it");
      // lets try joining a string and non string to create formatted output!
      System.out.println("The value of 4 + 5 is: " + 4 + 5);
      // notice the output is very wrong? It shows the value is 45, which mathwise is very wrong. What happened?
      // a string being used on either side of a + operator makes the result a string join instead of math. The content of the " " + 4 has a string on left hand side.
      // but what if I wanted to do math? We have to do the math separately from the string join. We can use () to separate them
      System.out.println("The value of 4 + 5 is: " + (4+5)); // Now it will do the math in the () first, THEN join the math output to the string on the left of the +
      
      
      
    }
}
import java.util.*;
import java.io.*;
//Lab 7 Starter file
public class Lab7
{
	public static void main( String args[] ) throws Exception
	{
		if (args.length < 1 )
		{
			System.out.println("usage: $ java Lab7 Requires a filename to read from!");
			System.exit(0);
		}
		ArrayList<Integer> wordList= new ArrayList<Integer>();
		//Create your arraylist
		Scanner keyboard = new Scanner(System.in);
		// Create a scanner to read from the keyboard
		Scanner infile = new Scanner( new File(args[0]));
		// Create a scanner to read from the file
		
			// add item to arraylist
		while ( infile.hasNextInt() )//File Read Loop
		{
			wordList.add(infile.nextInt());// add item to arraylist
		}
		// end loop
		printArrayList(wordList);
		//call printArrayList
		System.out.println("The length of the arraylist is: " +  wordList.size());
        //output a message including the length of the arraylist
		System.out.println("Please enter the numeric value you would like to remove: ");
		//prompt user to enter the numeric value they would like to remove
		int target= keyboard.nextInt();
		//create a 'target' variable to hold the value user would like to remove
		int isthere = wordList.indexOf(target); //is the target in the list? if not, -1 will be returned
        while (isthere != -1) //anything other than -1 means the target IS in the list, it needs to be removed
        {
            int loc = wordList.indexOf(target); //find the target
            wordList.remove(loc); //remove it!
            isthere = wordList.indexOf(target);//search the arraylist again and determine if any copies remain, also serves to control the loop to prevent a non existing removal attempt
        }
		//remove item from arraylist, you will need to determine the indexOf of your 'target' first
		printArrayList(wordList);
		//call printArrayList;
		System.out.println("The length of the arraylist is: " +  wordList.size());
		//output a message including the length of the arraylist
		

	} // END MAIN

	// ############################################################################################################

	

	static void printArrayList( ArrayList<Integer> array  )
    {
	    for ( int number : array ) 
            System.out.println( number);
		// use an enhanced for loop to output each item of the arraylist
    }

} // END CLASS
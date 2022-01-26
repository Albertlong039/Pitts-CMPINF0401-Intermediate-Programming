import java.io.File; //this allows us to make the File object on line 7
import java.io.FileNotFoundException; // we need to catch a FileNotFoundException if the file name we entered for File is
// not there. Look at the line we declared the main method on. It now has "throws FileNotFoundException" to catch
// this type of error
import java.util.Scanner;
public class FileReadSample {
    public static void main(String args[]) throws FileNotFoundException {
		/* Make sure your text file is ANSI encoded or java may not read it correctly. Open it in a text editor and select it
		if its not already there.
		NEVER COPY PASTE TEXT FROM A WEBPAGE INTO NOTEPAD, download and save the file itself. You will introduce invisible
		formatting characters that we can't see but java will find and not know how to handle them
		*/
		Scanner infile = new Scanner(new File("inputdemo.txt")); // We connect our Scanner to a file instead of keyboard
		String line;
		while (infile.hasNext()) // this is the simplist test for a file reading loop. It will continue as long as the file has text to read
		{
			line = infile.nextLine(); //Pulls in whole line of file input
			System.out.println(line);
		}
	
	
	
	}
	
}
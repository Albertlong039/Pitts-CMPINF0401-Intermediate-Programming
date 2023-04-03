import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
public class A2 {
    public static void main(String args[]) throws FileNotFoundException,IOException {
      double taxable,ltax,stax,ptax,ftax,takehome;
	  int income,retire;
      String name;
      boolean city;
	  // make scanner to read input file
	  //make filewriter for output file
	  //////////Begin loop
	  Scanner infile = new Scanner(new File("a2input.txt")); 
	  FileWriter myWriter = new FileWriter("a2output.txt");
		String line;
		while (infile.hasNext()) 
		{
			name = infile.next();
			income = infile.nextInt();
			retire = infile.nextInt();
			city = infile.nextBoolean();
			taxable = income-retire;
			if(city)
				ltax = taxable * .02;
			else
				ltax = taxable * .01;
			ptax = taxable * .062;
			stax = taxable * .0307;
			if (taxable >= 0 && taxable <= 8500)
				ftax = 0;
			else if (taxable > 8500 && taxable <= 12000)
				ftax = taxable* .1;
			else if (taxable > 12000 && taxable <= 20000)
				ftax = taxable* .15;
			else if (taxable > 20000 && taxable <= 50000)
				ftax = taxable* .2;
			else 
				ftax = taxable* .25;
			takehome=taxable-ftax-stax-ltax-ptax;
			myWriter.write("Taxpayer name: " + name + "\n" );
			myWriter.write("Ftax is: " + ftax + "\n");
			myWriter.write("Stax is: "+ stax + "\n");
			myWriter.write("Ltax is: "+ ltax + "\n");
			myWriter.write("Ptax is: "+ ptax + "\n");
			myWriter.write("Takehome is: "+ takehome + "\n");
		}
		myWriter.close();
	
	  //use scanner to set values for income,retire,name,city
	  // calc taxable as income - retire
	  // city residents pay 2% of their txable income to local taxable otherwise its 1% for non city
	  // payroll tax is a flat 6.2% of taxable	  
	  // state tax is a flat 3.07% of taxable
	  /* Federal tax brackets
	  taxable is:
	  0-8500 0%
	  less than or eqaul to 12000 10%
	  less than or eqaul to 20000 15%
	  less than or equal to 50000 20%
	  over that amount is 25%
	  ** this should be an inclusive test block of ascending or descending tests OR two sided AND
	  */  
	 
	  //Output phase. You MAY output to terminal in addition to the FILE but the FILE output is required!
	  //Output each on their own line with labeling of each value. See a2output.png
     
      //////////end loop
	  // close your output file
    }//main
}//class
import java.util.Scanner;
public class GenWhat {
    public static void main(String args[]) {
      Scanner key = new Scanner(System.in);
      int yob;
      System.out.print("Enter your year of birth as a 4 digit number: ");
      yob = key.nextInt();
      String gen = "?";
      if (yob <= 1924)
         gen = "Greatest Generation";
      else if (yob >= 1925 && yob <= 1945)
         gen = "Silent Generation";
      else if (yob >= 1946 && yob <= 1964)
         gen = "Ok, Boomer";
      else if (yob >= 1965 && yob <= 1980)
         gen = "You remember when MTV played music as a member of Gen X";
      else if (yob >= 1981 && yob <= 1996)
         gen = "Millenial";
      else if (yob >= 1997)
         gen = "Gen Z Zoomer";
      

      System.out.println("Your generation is:  " + gen);
    }
}
import java.io.File;
import java.io.IOException;
public class A4 {
   public static void listOfFiles(File dirPath){

      //create an array of File Objects, populate it with listFiles() method of the file sent into this method
      for(File folders : dirPath.listFiles()){
        if(folders.isDirectory()){
          	listOfFiles(folders);
        }
        else{
          System.out.println(folders.getAbsolutePath());
        }
      }
      //Use an enhanced for loop to go through each File object in that array
      	//Inside the loop you will create your if-else condition to control the recursive method
      		//If the current File is a file not a directory then you will output the AbsolutePath and the Name of the file
      		//else(meaning we have found a directory) make a recursive call and pass that file into the method

   }
   public static void main(String args[]) throws IOException {
      //Creating a File object for directory
      File file = new File("C:/Users/Yixuan/OneDrive - University of Pittsburgh/Desktop/memes");
      //List of all files and directories
      listOfFiles(file);
   }
}

public class EntertheMatrix {
    public static void main(String args[]) {
      int[][] matrix = new int[5][3];
      for (int row=0 ; row < matrix.length ; row++ ) //traverses the row "going down"
          for (int col = 0 ; col < matrix[row].length ; col++) //traverses the column "going right"
             matrix[row][col] = row+col;
             
      System.out.println("Matrix is populated");
      // Lets see it!
      for (int row=0 ; row < matrix.length ; row++ ) {
          System.out.println("");
          for (int col = 0 ; col < matrix[row].length ; col++)
             System.out.print(matrix[row][col] +  " , ");
      }
      System.out.println("\nCenter value of 3 is located at address [2][1]: " + matrix[2][1]);
      /* Lets try a little exercise. I want to grab the whole right hand vertical column of values:
      First we need to determine what their addresses would be so we can see if we can do this easier than manually pulling the values one at a time
      2   address [0][2] 
      3           [1][2]
      4           [2][2]
      5           [3][2]
      6           [4][2]  see a pattern of what is changing vs staying the same?
      I can pull all of these out of the matrix using only a single loop(we arent changing dimensions as we traverse)
      
      
      */
      int[] extracted = new int[matrix.length]; // its size is set to the LENGTH of the matrix its pulling from
      for (int add = 0; add < extracted.length;add++)
            extracted[add] = matrix[add][2]; //2 is hardcoded for column as it wont change
      System.out.println("Lets print out our extracted array");  
      printArray(extracted);
      
    }
    static void printArray( int[] array )
    {
        for ( int number : array ) // enhance for loop, : operator is the "set operator"
            System.out.println( number + " ");
        System.out.println();
    }
}
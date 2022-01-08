import java.util.Scanner;
public class Harry_MultiDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
      
        System.out.println("Enter the number of columns: ");
        int columns = sc.nextInt();
      
        //Creating a new 2-D array named as flats
        int[][] flats = new int[rows][columns];
        //System.out.println("Enter the elements");
      
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                System.out.print("Enter the element at"+"["+i+"]"+"["+j+"]"+": ");
                flats[i][j] = sc.nextInt();
            }
        }
      
        //Displaying the created flats array
      
        System.out.println("Displaying the 2-D array named as flat");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {

                System.out.print(flats[i][j]+" ");
            }
            System.out.println();
        }

    }
}

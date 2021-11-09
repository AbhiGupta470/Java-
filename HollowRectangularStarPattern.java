//* * * * *
//*       *
//* * * * *     
import java.lang.*;
import java.util.Scanner;
public class HollowRectangularStarPattern 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
       for(int i=1;i<=rows;i++)
       {
           for(int j=1;j<=columns;j++)
           {
               if(i==1 || i==rows || j==1 || j==columns)
               System.out.printf("*");
               else
               System.out.printf(" ");
           }
           System.out.printf("\n");
       }
    }
}

//Write a java program to add two matrices of size 2X3
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows for both the arrays:");
		int rows = sc.nextInt();
		System.out.print("Enter the number of columns for both the arrays: ");
		int columns = sc.nextInt();
		int[][] arr1 = new int[rows][columns];
		int[][] arr2 = new int[rows][columns];
		int[][] res = new int[rows][columns];
		System.out.println("Enter the elements in the first array: ");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				arr1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the elements in the second array: ");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				arr2[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				res[i][j]= arr1[i][j]+arr2[i][j];
			}
		}
		System.out.println("The resultant sum of the matrix is: ");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				System.out.print(res[i][j]+" ");
			}
			System.out.println("");
		}
	}
}

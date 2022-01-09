//Write a java program to find out whether an array is sorted or not
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size =  sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements in the array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		boolean sorted = true;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i+1])
			{
				sorted = false;
				break;
			}

		}
		if(sorted)
			System.out.println("The array is sorted");
		else
			System.out.println("The array is not sorted");
	}
}

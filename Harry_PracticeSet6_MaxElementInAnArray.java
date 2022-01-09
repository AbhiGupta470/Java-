//Write a java program to find out maximum number in an array
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
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max = arr[i];
			}
		}
		System.out.println(max);
	}
}

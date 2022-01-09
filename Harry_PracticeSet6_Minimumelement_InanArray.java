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
    //New Conecept:- For each loop and Wrapper Class Function
		int min = Integer.MAX_VALUE;
		for(int element:arr)
		{
			if(element<min)
			{
				min = element;
			}
		}
		System.out.println(min);
	}
}

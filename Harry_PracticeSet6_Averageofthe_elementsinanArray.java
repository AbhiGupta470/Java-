//Calculate the average marks from an array containing marks of all the students in Physics using for Each Loop
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements in the array");
		int sum = 0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
			sum+=arr[i];
		}
		float avg = sum/size;
		System.out.println("The average marks of the student are:"+avg);

	}
}

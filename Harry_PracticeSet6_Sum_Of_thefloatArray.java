import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();
		float[] arr = new float[size];
		float sum = 0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextFloat();
			sum+=arr[i];
		}
		System.out.print("The sum of the array is: "+sum);
	}
}

//Write a program to find out whether a given integer is present in an array or not
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter the number which has to be find out: ");
		int num = sc.nextInt();
		boolean isinArray = false;
		for(int i=0;i<arr.length;i++)
		{
			if(num==arr[i]) {
				isinArray = true;
				break;
			}
		}
		if(isinArray==true)
			System.out.println("The element is present in the array");
		else
			System.out.println("The element is not present in the array");
  }
}

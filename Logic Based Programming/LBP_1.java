// Write a program to check whether a given number is even or odd
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a%2==0)
		{
		    System.out.println("Even");
		}
		 else {
		     System.out.println("Odd");
		 }
	}
}

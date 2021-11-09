import java.util.Scanner;
import java.lang.*;
class FibonacciSeries
{
	public static void main(String[] args)
	{
	int num1=0, num2=1, num3;
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	System.out.printf("%d %d",num1,num2);
	for(int i=2; i<num; i++)
	{
	num3 = num1+num2;
	System.out.printf(" %d",num3);
	num1= num2;
	num2 = num3;
	}
	}
}
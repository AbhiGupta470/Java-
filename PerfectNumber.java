import java.util.Scanner;
public class PerfectNumber
{
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	int sum=0;
	int num = sc.nextInt();
	for(int i=1;i<num;i++)
	{
	if(num%i==0)
	sum+=i;
	}
	if(sum==num)
	System.out.printf("True");
	else
	System.out.printf("False");
	
}
}
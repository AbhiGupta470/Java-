import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt(),rev=0,rem,n=0;
     n = num;
    
    while(num>0)
    {
            rem = num%10;
            rev = rev*10+rem;
            num = num/10;
    }
    if(n==rev)
    {
    System.out.println("Palindrome");
    }
}
}

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt(),prod=1;
    for(int i=num;i>=1;i--)
    {
        prod*=i;
    }
    System.out.println(prod);
    }
}

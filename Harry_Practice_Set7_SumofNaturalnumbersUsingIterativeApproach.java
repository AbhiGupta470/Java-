import java.util.Scanner;
public class Main
{
    static int Natural(int n)
    {
        int sum = 0;
        for(int i=1;i<=n;i++)
        {
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("The sum of the natural numbers till the entered number is: "+ Natural(num));
    }
}

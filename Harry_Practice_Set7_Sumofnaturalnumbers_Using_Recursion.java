import java.util.Scanner;


public class Main
{
    static int Sum(int n)
    {
         if(n==1)
             return 1;
         else
         {
             return n+Sum(n-1);
         }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(Sum(num));
    }
}

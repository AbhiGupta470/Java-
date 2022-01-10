import java.util.Scanner;
public class Main
{
    static void Multiply(int n)
    {
          for(int i=1;i<=10;i++)
          {
              System.out.printf("%d X %d = %d\n",n,i,n*i);
          }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Multiply(num);
    }
}

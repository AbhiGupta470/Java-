import java.util.Scanner;
public class Main
{
    static void Pattern(int n)
    {
         for(int i=1;i<=n;i++)
         {
             for(int j=n;j>=i;j--)
                 System.out.print("* ");
             System.out.println("");
         }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Pattern(num);
    }
}

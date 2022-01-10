import java.util.Scanner;
public class Recursion_In_Java
{
    static  int num1 = 0,num2 = 1,sum=0;
    static void fibonacci(int num)
    {


        if(num>0) {
            sum = num1 + num2;
            System.out.print(" " + sum);
            num1 = num2;
            num2 = sum;
            fibonacci(num - 1);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print(num1+" "+num2);
         fibonacci(num-2);

    }
}

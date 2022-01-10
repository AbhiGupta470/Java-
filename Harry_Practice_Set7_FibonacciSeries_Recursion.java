import java.util.Scanner;
public class Main
{
    //Java program to print nth term of fibonacci series using recursion
    static int Fibonacci(int n)
    {
        if(n==1 || n==2)
            return n-1;
        else
            return Fibonacci(n-1)+Fibonacci(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position of which you have to find" +
                " out the term existing there:");
        int num = sc.nextInt();
        System.out.println(Fibonacci(num));
    }
}

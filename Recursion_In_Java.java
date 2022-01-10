import java.util.Scanner;
public class Recursion_In_Java {
    //Recursion means when the function calls itself
    static int factorial(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        else {
            return n * factorial(n - 1);
        }
    }
    // Using iterative approach
    /*
    static int factorial_iterative(int n)
    {
        if(n==0 || n==1)
            return 1;
        else{
        int fact = 1;
        for (int i = n; i >= 1; i--) {
            fact = fact * i;
        }
        return fact;
    }
    */

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("The factorial of the entered number is: "+ factorial(num));

    }
}

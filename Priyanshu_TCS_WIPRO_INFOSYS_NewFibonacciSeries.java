/*
Given a number N, find the first N Fibonacci numbers. The first two number of the series are 1 and 1.

Example 1:

Input:
N = 5
Output: 1 1 2 3 5
Example 2:

Input:
N = 7
Output: 1 1 2 3 5 8 13

Return a list of First N Fibonaicc number
*/
import java.util.Scanner;
public class Recursion_In_Java
{
    static  int num1 = 1,num2 = 1,sum=0;
    static void RecursiveFibonacci(int num)
    {
        if(num>0)
        {
            sum = num1+num2;
            System.out.print(" "+sum);
            num1 = num2;
            num2 = sum;
            RecursiveFibonacci(num-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print(num1+" "+num2);
        RecursiveFibonacci(num-2);

    }
}

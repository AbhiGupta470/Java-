import java.util.Scanner;
public class SumUserInputThreeNumbers {
    public static void main(String[] args)
    {
        Scanner stolas = new Scanner(System.in);
        System.out.print("Enter the first number");
        int int1 = stolas.nextInt();
        System.out.print("Enter the second number");
        int int2 = stolas.nextInt();
        System.out.print("Enter the third number");
        int int3 = stolas.nextInt();
        int sum = int1 + int2 + int3 ;
        System.out.print("The sum of all the entered three numbers is: "+sum);

    }
    
}
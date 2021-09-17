import java.util.Scanner;
public class TakingInput{
    public static void main(String[] args)
    {
        Scanner abhi = new Scanner(System.in);
        //Adding two number by taking input from the user or keyboard
        System.out.print("Enter the first number");
        int a = abhi.nextInt();
        System.out.print("Enter the second number");
        int b = abhi.nextInt();
         int sum = a+b;
         System.out.print("The sum of the entered numbers is: "+sum);




    }


}

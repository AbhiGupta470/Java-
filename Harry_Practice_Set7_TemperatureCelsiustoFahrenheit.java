import java.util.Scanner;
public class Main
{
    // java program to convert celsius to fahrenheit
    static float Fahrenheit(float n)
    {
        return (n*9/5)+32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float temp = sc.nextFloat();
        System.out.println("The converted temperature into fahrenheit is: "+ Fahrenheit(temp));
    }
}

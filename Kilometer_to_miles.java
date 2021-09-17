import java.util.Scanner;
public class Kilometer_to_miles {
    public static void main(String[] args)
    {
        System.out.print("Enter the kilometers: ");
        Scanner sc = new Scanner(System.in);
        double km = sc.nextFloat();
        double miles = (km * 0.621371);
        System.out.println("Your kilometers in miles are: "+miles);
    }
    
}

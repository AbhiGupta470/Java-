import java.util.Scanner;
public class HelloUsername {
    public static void main(String[] args)
    {
        Scanner abhi = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = abhi.next();
        System.out.print("Hello "+name+" have a good day!");

    }
    
}

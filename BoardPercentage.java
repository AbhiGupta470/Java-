import java.util.Scanner;
//Finding the result percentage of the student of CBSE Board
public class BoardPercentage{
    public static void main(String[] args)
    {
        Scanner stolas = new Scanner(System.in);
        System.out.print("Enter the marks of physics:");
        int phy = stolas.nextInt();
        System.out.print("Enter the marks of chemistry");
        int chem = stolas.nextInt();
        System.out.print("Enter the marks of maths");
        int maths = stolas.nextInt();
        System.out.print("Enter the marks of english");
        int eng = stolas.nextInt();
        System.out.print("Enter the marks of java");
        int java = stolas.nextInt();
        int sum = phy + chem + maths + eng + java;
        int perc = (sum*100)/500;
        System.out.println("The percentage of the candidate is: "+perc);
        



    }
}
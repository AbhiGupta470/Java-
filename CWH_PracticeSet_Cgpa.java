import java.util.Scanner;
public class CWH_PracticeSet_Cgpa {
    public static void main(String[] args)
    {
        //finding the CGPA Of the candidate
        Scanner stolas = new Scanner(System.in);
        System.out.print("Enter the marks of first subject");
        int subj1 = stolas.nextInt();
        System.out.print("Enter the marks of second subject");
        int subj2 = stolas.nextInt();
        System.out.print("Enter the marks of the third subject");
        int subj3 = stolas.nextInt();
        float CGPA = (subj1 + subj2 + subj3)/30;
        System.out.print("The CGPA of the candidate is: "+CGPA);


    }
}

/*Write a program to print the names of students by creating a Student class. 
If no name is passed while creating an object of Student class, then the name should be "Unknown", 
otherwise the name should be equal to the String value passed while creating object of Student class.*/
public class Main 
{
        Main()
        {
            System.out.println("Unknown");
        }
        Main(String strin)
        {
            System.out.println(strin);
        }
        public static void main(String[] args)
        {
        Main obj = new Main();
        Main obj1 = new Main("Abhi Gupta");
        }
}

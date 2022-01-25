import java.util.Scanner;
import java.lang.Math;
public class Solution
{
    static void StringPrinter(String str)
    {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(i%2==0)
                System.out.print(chars[i]);
        }
    }
    public static void main(String[] args)
    {
        //System.out.println("Enter a String");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringPrinter(str);

    }
}

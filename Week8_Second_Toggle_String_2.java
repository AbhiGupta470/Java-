import java.util.Scanner;
public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
                if(chars[i]>='a' && chars[i]<='z')
                    chars[i] = (char)(chars[i]-32);
                else if(chars[i]>='A' && chars[i]<='Z')
                    chars[i] = (char)(chars[i]+32);
                else
                    chars[i] = chars[i];

        }
        for (int i = 0; i < chars.length; i++)
            System.out.print(chars[i]);

    }
}

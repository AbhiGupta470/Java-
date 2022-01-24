import java.util.Scanner;
public class Solution {
    static void IsPalindrome(String str)
    {
        char[] arr = str.toCharArray();
        char[] arr1 = new char[arr.length];
        int k = 0;
            for (int i = arr.length - 1; i >= 0; i--) {
                arr1[k] = arr[i];
                k++;
            }
            int flag = 0;
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]==arr[i])
                flag = 0;
            else
                flag = 1;
        }
        if(flag==0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
       IsPalindrome(str);
    }
}

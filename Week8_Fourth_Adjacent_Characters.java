import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr = str.toCharArray();
        if(arr.length%2==0)
        {
        char temp;
        for(int i=0;i<arr.length-1;i+=2)
        {
            temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"");
        }
        }
        else
            System.out.print("Odd length.");
    }
}

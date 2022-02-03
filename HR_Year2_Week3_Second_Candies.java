import java.util.Scanner;
import java.lang.Math;
public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        long sum = 0;
        int[] arr = new int[size];
        int[] candies = new int[size];
        for(int i = 0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
            candies[i] = 1;
        }
        for(int i = 0;i<arr.length-1;i++)
        {
            if(arr[i]<arr[i+1])
                candies[i+1]=candies[i]+1;
        }
        for(int i=arr.length-1;i>0;i--)
        {
            if(arr[i]<arr[i-1])
                candies[i-1]=Math.max(candies[i-1],candies[i]+1);
        }
        for(int i = 0;i<candies.length;i++)
        {
            sum+=candies[i];
        }
        System.out.println(sum);
    }
}

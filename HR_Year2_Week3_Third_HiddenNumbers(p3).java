// Write a java program to find out a number in a given array such that when the number is subtracted from the each elements of the array
// then the sum of the difference should be 
// equal to zero otherwise if the element is not present in the array then print "-1".
import java.util.Scanner;
public class Solution
{
    int[] arr;
    Solution(int size)
    {
        arr = new int[size];
    }
    public static void main(String[] HareKrishna)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        Solution obj = new Solution(size);
        for(int  i = 0 ; i < obj.arr.length ; i++)
        {
            obj.arr[i] = sc.nextInt();
        }
        int sum = 0,flag = 0;
        for(int i = 0 ; i< obj.arr.length ; i++)
        {
            sum = 0;
            for(int j = 0 ;j < obj.arr.length ; j++)
            {
                sum += obj.arr[j] - obj.arr[i];
            }
            if(sum == 0){
                System.out.println(obj.arr[i]);
                flag=1;
            }
        }
        if(flag == 0)
            System.out.println("-1");
    }
}

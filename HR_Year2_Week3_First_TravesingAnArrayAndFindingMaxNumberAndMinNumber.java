// Write a java program to find out the maximum number and the minimum number in the array by storing the first element of the array in a variable then traversing through an array
// to find out the maximum number and the minimum number from the array.
import java.util.Scanner;
public class Solution {
    int[] arr;
    Solution(int size)
    {
        arr = new int[size];
    }
    public static void main(String[] HareRamaHareKrishna) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        Solution obj = new Solution(size);
        for(int i=0;i<obj.arr.length;i++)
        {
            obj.arr[i] = sc.nextInt();
        }
        int smallest_number = obj.arr[0],maximum_number=obj.arr[0];
        for(int i=1;i<obj.arr.length;i++)
        {
            if(obj.arr[i]<smallest_number)
                smallest_number = obj.arr[i];
            if(obj.arr[i]>maximum_number)
                maximum_number = obj.arr[i];
        }
        System.out.println(smallest_number);
        System.out.println(maximum_number);

    }
}

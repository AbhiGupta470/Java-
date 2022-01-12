import java.util.Scanner;
public class Solution
{
    int arr[];
    Solution(int size)
    {
        arr = new int[size];
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt(),sum=0;
        Solution obj = new Solution(size);
        //int[] arr = new int[size];
        for(int i=0;i<obj.arr.length;i++)
        {
            obj.arr[i] = sc.nextInt();
        }
        for(int k=0;k<obj.arr.length;k++)
        {
            for(int j=0;j<=k;j++)
                sum+=obj.arr[j];
        System.out.print(sum+" ");
        sum = 0;
        }
    }
}

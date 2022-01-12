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
        int size = sc.nextInt(),count=0;
        //int arr[] = new int[size];
        Solution obj = new Solution(size);
        for(int i=0;i<obj.arr.length;i++)
            obj.arr[i] = sc.nextInt();
        for(int i=0;i<obj.arr.length;i++)
        {
            String str = Integer.toString(obj.arr[i]);
            if(str.length()%2==0)
                count+=1;
        }
        System.out.println(count);
    }
}

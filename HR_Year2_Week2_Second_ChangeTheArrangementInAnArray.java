import java.util.Scanner;
public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] arr = new String[size];
        for(int i=0;i<arr.length;i++)
            arr[i] = sc.next();
        String last = arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--)
        {
            arr[i] = arr[i-1];
        }
        arr[0] = last;
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

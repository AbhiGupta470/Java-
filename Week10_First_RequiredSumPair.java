import java.util.Scanner;
public class Solution
{
    static void RequiresSumPair(int sum,int[] arr)
    {
        int flag=0;
        for (int i = 0; i < arr.length; i++) {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==sum) {
                    System.out.println(i+" "+j);
                    flag = 0;
                    break;
                }
                else
                    flag=1;
            }
            if(flag==0)
                break;
        }
        if(flag==1)
            System.out.println("no pair found");
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int size = sc.nextInt();
       int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
       int sum = sc.nextInt();
        RequiresSumPair(sum,arr);
    }
}

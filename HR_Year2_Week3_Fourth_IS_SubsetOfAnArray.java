import java.util.Scanner;
public class Solution 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0;i<T;i++)
        {
            int size1 = sc.nextInt();
            int size2 = sc.nextInt();
            int[] arr1 = new int[size1];
            int[] arr2 = new int[size2];
            for(int l = 0;l<arr1.length;l++)
            {
                arr1[l] = sc.nextInt();
            }
            for(int m=0;m<arr2.length;m++)
            {
                arr2[m] = sc.nextInt();
            }
            int count = 0;
        for(int j=0;j<arr2.length;j++)
        {
            for(int k=0;k<arr1.length;k++)
            {
                if(arr2[j]==arr1[k])
                count+=1;
            }
        }
        if(count==arr2.length)
        System.out.println("Yes");
        else
        System.out.println("No");
        }
    }
}

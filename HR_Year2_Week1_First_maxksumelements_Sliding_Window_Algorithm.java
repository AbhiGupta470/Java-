//Done by using Sliding Window Algorithm
import java.util.Scanner;
public class Shantam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int k = sc.nextInt();
        if(size<k)
            System.out.println("-1");
        else
        {
            int[] arr = new int[size];
            for (int i = 0; i < arr.length ;i++) {
                arr[i] = sc.nextInt();
            }
            int sum=0;
            for (int i = 0; i < k; i++) {
                sum+=arr[i];
            }
            int newsum = sum,max = Integer.MIN_VALUE;
            for (int i=k;i<size;i++)
            {
                newsum += arr[i]-arr[i-k];
                if(newsum>max)
                    max=newsum;
            }
            System.out.println(max);
        }
    }
}

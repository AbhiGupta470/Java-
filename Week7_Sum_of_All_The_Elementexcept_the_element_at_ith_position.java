import java.util.Scanner;
public class Shantam
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
            for (int i = 0; i < arr.length; i++)
                arr[i] = sc.nextInt();
            int sum=0;
            int[] arr2 = new int[size];
        for (int i = 0; i < arr.length; i++)
            sum+= arr[i];
        for (int i = 0; i < arr.length; i++)
            System.out.print(sum-arr[i]+" ");
    }
}

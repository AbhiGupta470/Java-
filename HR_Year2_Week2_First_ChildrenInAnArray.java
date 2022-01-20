import java.util.Scanner;
public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int flag=0,k=0;
        for (int i = 0; i < arr.length; i++)
        {
            if(i==arr.length-1) {
                System.out.print(arr[i]);
                break;
            }
            else
            {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] >= arr[j]) {
                    flag = 1;
                    break;
                }
                else
                    flag=0;
            }
            }
            if(flag==0)
            {
                System.out.print(arr[i]+" ");

            }


        }

    }
}

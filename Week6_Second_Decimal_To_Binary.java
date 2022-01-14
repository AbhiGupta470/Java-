import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[1000]; //Considering the maximum binary digits in an array to be 1000
       int i = 0;
        while(num>0)
        {
            arr[i] = num%2;
            num = num/2;
            i++;
        }
        for (int j = i-1; j >=0 ; j--) {
            System.out.print(arr[j]);
        }
    }
}

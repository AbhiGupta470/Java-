import java.util.Scanner;
public class Solution {
    static void StudentMarksSum(char ch,int[] arr)
    {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(ch=='b' && i%2==0)
                sum+=arr[i];
            else if(ch=='g' && i!=0 && i%2!=0)
                sum+=arr[i];

        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        char ch = sc.next().charAt(0);
        StudentMarksSum(ch,arr);
    }
}

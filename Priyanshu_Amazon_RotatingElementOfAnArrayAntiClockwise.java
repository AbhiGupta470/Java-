/*
Given an unsorted array arr[] of size N, rotate it by D elements (Anti - clockwise). 

Input:
The first line of the input contains T denoting the number of testcases. First line of each test case contains two space separated elements, N denoting the size of the array and an integer D denoting the number size of the rotation. Subsequent line will be the N space separated array elements.

Output:
For each testcase, in a new line, output the rotated array.Example:
Input:
2
5 2
1 2 3 4 5 
10 3
2 4 6 8 10 12 14 16 18 20

Output:
3 4 5 1 2
8 10 12 14 16 18 20 2 4 6

Explanation :
Testcase 1: 1 2 3 4 5  when rotated by 2 elements, it becomes 3 4 5 1 2
*/
import java.util.Scanner;
public class Rotating_An_Array {
   static void RotatingAntiClockwiseByAnElement(int D,int[] arr)
    {
        for(int j=0;j<D;j++)
        {
            int initial = arr[0];
            for(int i=0;i<arr.length-1;i++)
            {
                arr[i] = arr[i+1];
            }
            arr[arr.length-1] = initial;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int D = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        RotatingAntiClockwiseByAnElement(D,arr);
    }
}

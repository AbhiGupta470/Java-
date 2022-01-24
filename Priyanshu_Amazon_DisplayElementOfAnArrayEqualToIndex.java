/*Given an array Arr of N positive integers. Your task is to find the elements whose value is equal to that of its index value ( Consider 1-based indexing ).Make an method ValueEqualToIndex which contains two parameter int arr[] and interger N(size), this method will return list of indices where the given condition are satisfied. 


Example 1:

Input: 
N = 5
Arr[] = {15, 2, 45, 12, 7}
Output: 2
Explanation: Only Arr[2] = 2 exists here.
Example 2:

Input: 
N = 1
Arr[] = {1}
Output: 1
Explanation: Here Arr[1] = 1 exists.*/
import java.util.Scanner;
public class Element_Equal_To_Array_Index {
    static void DisplayElementOfArray(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==i+1)
                System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        DisplayElementOfArray(arr);

    }
}

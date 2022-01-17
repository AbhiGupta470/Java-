//Write a java program to delete an element from array at a specified index which will be given by the user
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the index from which you want to delete the element from the array: ");
        int index = sc.nextInt();
        int store = arr[index];
        //int index = position-1;
        for(int i= index+1;i<arr.length;i++)
        {
            arr[i-1] = arr[i];
        }
        System.out.println("After deleting the element at the specified index the array becomes: ");
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}

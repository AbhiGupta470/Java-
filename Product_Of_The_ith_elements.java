//Write a java program to calculate the product of all the elements after they are coming from index i
// example:-
//size of the array = 5
// Elements in the array  = 10 3 6 5 2
// Output should be  = 180 60 10 2 1
import java.util.Scanner;
public class Shantam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            int prod = 1;
            int[] arr2 = new int[size];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                prod*=arr[j];
            }
            arr2[i] = prod;
            prod = 1;
        }
        for (int i = 0; i < arr2.length ;i++) {
            System.out.print(arr2[i]+" ");
        }
        }
    }

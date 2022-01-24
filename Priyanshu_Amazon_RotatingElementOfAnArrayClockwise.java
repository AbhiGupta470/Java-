// Write a java program to rotate array elements of an array in clockwise
import java.util.Scanner;
public class Rotating_An_Array {
static void RotatingClockwiseByAnElement(int D,int[] arr)
    {
        for (int i = 0; i < D; i++) {
            int last = arr[arr.length-1];
          for(int j=arr.length-1;j>0;j--)
          {
              arr[j] = arr[j-1];
          }
          arr[0] = last;
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

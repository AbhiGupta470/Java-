// Write a java program to rotate an array in anti clockwise
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
        //RotatingClockwise(arr);
      // RotatingAntiClockwise(arr);
        //RotatingClockwiseByAnElement(D,arr);
    }
}

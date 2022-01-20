import java.util.Scanner;
public class Practice
{
    static void CountArray(int arr[],int arr1[])
    {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr1.length; j++) {
                if(arr1[j]>=arr[i])
                    count+=1;
            }
            System.out.print(count+", ");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int[] arr1 = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        CountArray(arr, arr1);
    }
}

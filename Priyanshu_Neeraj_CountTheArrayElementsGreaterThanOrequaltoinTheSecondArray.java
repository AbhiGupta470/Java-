/*Mr Raman is having two unsorted arrays with names myarr1 and myarr2. They can be of any size.
They may contain duplicate values also. Raman wants for each element in myarr1[ ] to count elements greater than or equal to it in array myarr2[].

Example 

Imagine the size of both the arrays are 5 

myarr1[]  values  {3,4,1,2,2}
myarr2[] values  {1,2,1,3,1}

Output :
1,0,5,2,28*/
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

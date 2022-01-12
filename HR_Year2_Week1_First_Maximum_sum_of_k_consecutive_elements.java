import java.util.Scanner;
public class Solution
{
    int arr[];   //New Concept Declaring an array outside main method
    Solution(int size)
    {
        arr = new int[size];    //New Concept Creating an array inside the parameterized constructor of the class
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int k = sc.nextInt();
        Solution obj = new Solution(size);   //Passing the value to the constructor
        if(size<k)
            System.out.println("-1");
        else
        {
            for(int i=0;i<obj.arr.length;i++)
            {
                obj.arr[i] = sc.nextInt();
            }
            int sum = 0,max = Integer.MIN_VALUE;
            for(int i=0;i<(obj.arr.length-k)+1;i++)  //Main Logic
            {    sum = 0;
                for(int j=0;j<k;j++)
                {
                    sum+=obj.arr[i+j];
                }
                if(sum>max)
                    max = sum;
            }
            System.out.println(max);
        }
    }
}

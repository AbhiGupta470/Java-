import java.util.Scanner;
public class sa
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int ele = sc.nextInt(),index=-1;
        for(int i=0;i<size;i++)
        {
            if(ele==arr[i])
                index = i;
        }
        if(index!=-1)
        {
            for(int j=index;j<size-1;j++)
            {
                arr[j]=arr[j+1];
            }
            for(int k=0;k<size-1;k++)
            {
                System.out.printf("%d  ",arr[k]);
            }
        }
        else
            System.out.print("Not found.");
    }
}

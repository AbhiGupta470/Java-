//*****
//****
//***
//**
//*
import java.util.Scanner;
import java.lang.*;
public class InvertedHalfPyramidStarPattern
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        for(int i=1;i<=rows;i++)
        {
            for(int j=rows;j>=i;j--)
            {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }
}

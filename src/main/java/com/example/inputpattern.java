package com.example;

import java.util.Scanner;

public class inputpattern
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of test cases:");
        int t=sc.nextInt();
        System.out.println("enter the pattern style number:");

        for (int test = 1; test <=t ; test++)
        {
            int n = sc.nextInt();



                for (int i = 1; i <= n; i++)
                {
                    for (int j = 1; j <= i; j++)
                    {
                        System.out.print("* ");

                    }
                    System.out.println();
                }
        }



    }
}

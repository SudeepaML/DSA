package com.example;

import java.util.Scanner;

public class diamondpyeoo
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n=sc.nextInt();

        for (int i = 0; i <n ; i++)//4
        {
            for (int j = 0; j < n-i ; j++)//4
            {
                System.out.print("* ");

            }
            System.out.println();


        }

    }
}

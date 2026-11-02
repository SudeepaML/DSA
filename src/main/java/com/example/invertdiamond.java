package com.example;

import java.util.Scanner;

public class invertdiamond {




        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the value of n:");
            int n=sc.nextInt();

            for (int i = 0; i <n ; i++)//4
            {
                for (int j = i; j < n ; j++)//4
                {
                    System.out.print("* ");

                }
                System.out.println();


            }

        }
    }


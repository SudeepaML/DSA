package com.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class diamond {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n = sc.nextInt();
        if (n>= 1) {
            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < n; j++)
                {
                    System.out.print("* ");

                }
                System.out.println();

            }
        }
        else
        {
            System.out.println("please enter the num ber greater than 0");
        }

    }
}
package com.example;

public class mergetriangles {
    public static int p1(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++)//space
            {
                System.out.print(" ");

            }
            for (int j = 0; j < 2 * i + 1; j++)//star
            {
                System.out.print("*");


            }
            for (int j = 0; j < n - i - 1; j++)//space
            {
                System.out.print("");

            }
            System.out.println();

        }
        return n;
    }

    public static int invert(int n) {
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j <i ; j++)//space
            {
                System.out.print(" ");

            }
            for (int j = 0; j <2*n-(2*i+1) ; j++)
            {
                System.out.print("*");


            }
            for (int j = 0; j <i ; j++)
            {
                System.out.print(" ");

            }
            System.out.println();

        }
        return n;

    }

    public static void main(String[] args) {
       int result= p1( 5);
       int reselt=invert(5);

       // System.out.println(result);
      //  System.out.println(reselt);
    }

}


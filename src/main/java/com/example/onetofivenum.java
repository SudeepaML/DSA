package com.example;

public class onetofivenum {
    public static void main(String[] args)
    {
        int n=4;
        int num=0;

        for (int i = 0; i <n; i++)
        {
            for (int j = 1; j <=i+1 ; j++)
            {
                num=num+1;
                System.out.print( num +" ");
            }
            System.out.println( );
        }

    }
}

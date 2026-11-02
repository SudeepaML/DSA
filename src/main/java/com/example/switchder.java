package com.example;

import java.util.Scanner;

public class switchder
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your choice ");
        System.out.println("press-1 ----for ambition");
        System.out.println("press-2 ----for motivation");
        System.out.println("press-3 ----for discipline");
        System.out.println("press-4 ----for my life my wish");
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("i am too ambitious ");
                break;
            case 2:
                System.out.println("you dont need motivation just follow thins");
                break;
            case 3:
                System.out.println("discipline is enhalf i thinkO");
                break;
            case 4:
                System.out.println("graets your style gladly");
                break;
            default:
                System.out.println("your lazy kid");
        }
    }
}

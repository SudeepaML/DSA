package com.example;
//Your turn — apply the same logic independently
//Without copying the previous method, write a new method called calculateBonus(int salary).
//
//The company gives employees a bonus of ₹5,000 when their salary is ₹30,000 or more. Otherwise, the bonus is ₹0.
//
//Write the method and call it with salaries 25000 and 40000.
//
//Share your Java code here, and I'll check your method type, condition, return statement and output.
//Without copying the earlier method, write:
//
//static int calculateTax(int salary)
//
//The requirement is: return 1000 if the salary is ₹30,000 or more; otherwise, return 0.
public class supermarket {
//    static void name(String name){
//        System.out.println("enter your name:");
//
//    }
    static int claculateTax(int salary){
        if(salary>=30000) {
            System.out.println("your  tax is ");
            return 1000;
        }else {
            System.out.println("you dont need to pay tax ");
            return 0;
        }
    }
    static int calculateBonus(int salary){
        if(salary>=30000 ){

            System.out.println("congrats you got 5k bonus and you have to pay tax ");
            claculateTax(salary);
            return salary + 5000;


        }
        else {
            return salary;
        }

    }

    public static void main(String[] args) {
        System.out.println(calculateBonus(25000));
        System.out.println(calculateBonus(40000));

    }
}

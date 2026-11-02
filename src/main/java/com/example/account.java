package com.example;


class accountt {
    String a = "savings";

    void displaY() {
        System.out.println("the savings account");
    }

}
     class balance extends accountt {
        int balance;
        void dis()

        {
            System.out.print("this is my balance");
        }
    }
public class account{
    public static void main(String[] args) {
        balance b = new balance();
        b.dis();
        b.displaY();
    }
}
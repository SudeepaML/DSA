package com.example;

public class bank {
    public static void main(String[] args) {
        balaance b=new balaance();
        savingss s=new savingss();
        b.dis();
        System.out.println("here your details____");
        b.display();
        System.out.println("______________");
        s.dis();
        System.out.println("this month savings ");
        s.current_balance();
        System.out.println("thank you for banking with us");

    }

}
class accounttt{
    void dis() {
        String name = "sml";
        int age = 20;
    }
}
class balaance extends accounttt{
    int amount=5000;
    int balance=amount-1000;
    void display(){
        System.out.println("your balance is :"+balance);
    }

}
class savingss extends accounttt{
    void current_balance(){
        System.out.println("this is tooo low");
    }
}
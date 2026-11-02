package com.example;


public class debb{
    debb(int a) {
        System.out.println("a");
    }

    debb() {
        this(10);
        System.out.println("b");
    }



        public static void main(String[] args) {
         debb d = new debb();
            System.out.println("start");
            System.out.println(1);
            System.out.println("end");


    }
}


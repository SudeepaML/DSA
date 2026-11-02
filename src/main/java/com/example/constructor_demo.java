package com.example;

public class constructor_demo {
    constructor_demo(int a) {
        System.out.println("a");
    }

    constructor_demo() {
        System.out.println("b");
    }


    public class main {
        public static void main(String[] args) {
            constructor_demo d = new constructor_demo();
            System.out.println("start");
            System.out.println();
            System.out.println("end");

        }

    }
}


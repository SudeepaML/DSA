package com.example;

public class constru {
    String name;
    int age;
    constru(String n,int a){
        name=n;
        age=a;

    }

    public static void main(String[] args) {
        constru s1=new constru("ahara",12);
        constru s2=new constru("skkk",13);
        System.out.println(s1.name);
        System.out.println(s2.age);
    }
}

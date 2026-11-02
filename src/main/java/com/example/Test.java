package com.example;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor: creates a new object from an existing one
    Person(Person p) {
        this.name = p.name;
        this.age = p.age;
    }
}

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("Asha", 25);
        Person p2 = new Person(p1); // copy of p1
        System.out.println(p2.name + " " + p2.age); // Asha 25
    }
}
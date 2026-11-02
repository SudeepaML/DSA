package com.example;

public class encapsu {
    private int salary=3000;

    public void setSalary(int salary) {
        this.salary = salary+3000;
    }



    public int getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        encapsu s=new encapsu();
        s.setSalary(340);
        System.out.println( s.getSalary());
    }
}

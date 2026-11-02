package com.example;

public class deki {
    int id;
    String name;

    deki(int a,String b){
        id=a;
       name=b;
    }

    public static void main(String[] args) {
        deki d=new deki(101,"sudeep");
        deki d1=new deki(102,"sud");
        deki d2=new deki(103,"deep");
        deki d3=new deki(104,"sup");
        deki d4=new deki(105,"s");
        deki d5=new deki(106,"udeep");

        System.out.println(d.name);
        System.out.println(d1.id);
        System.out.println(d2.name);
        System.out.println(d3.id +" "+ d3.name);
        System.out.println(d4.name);
        System.out.println(d5.id);
    }


}

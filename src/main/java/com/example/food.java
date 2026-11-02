package com.example;

public class food {
    void dosa(){
        System.out.println("masala dosa");
    }


}
class drink extends food {
    void dosa() {
super.dosa();
        System.out.println("onion dosa");
    }

    public static void main(String[] args) {
        int a = 10;
        int g = 20;
        drink d = new drink();
        drink f=new drink();
        if (a > g) {
            f.dosa();
        } else {
            d.dosa();
        }
    }
}

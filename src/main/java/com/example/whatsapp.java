package com.example;

public class whatsapp {
    void msg(){
        System.out.println("singlr tick supports");
    }
}
class whatsaap1 extends whatsapp{
    void msg(){
      super.msg();
        System.out.println("double tick supports");
        System.out.println("story upload");

    }

}
class whatsapp3 extends whatsapp{
    void msg(){
        super.msg();

        System.out.println("calls supports");
    }

    public static void main(String[] args) {
        whatsapp3 w=new whatsapp3();
        w.msg();

    }
}
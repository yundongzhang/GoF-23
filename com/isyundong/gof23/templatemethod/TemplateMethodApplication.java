package com.isyundong.gof23.templatemethod;

public class TemplateMethodApplication {

    public static void main(String[] args) {

        AbstractDisplay d1 = new CharDisplay('H');
        AbstractDisplay d2 = new StringDisplay("Hello, world.");


        d1.display();
        d2.display();


    }

}

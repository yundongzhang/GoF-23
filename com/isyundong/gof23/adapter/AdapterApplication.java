package com.isyundong.gof23.adapter;

public class AdapterApplication {

    public static void main(String[] args) {

        Print print = new PrintBanner("Hello");

        print.printWeak();
        print.printStrong();

    }

}

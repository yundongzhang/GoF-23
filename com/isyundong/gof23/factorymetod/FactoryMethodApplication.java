package com.isyundong.gof23.factorymetod;

public class FactoryMethodApplication {

    public static void main(String[] args) {
        Factory idCardFactory = new IDCardFactory();

        Product c1 = idCardFactory.create("小明");
        Product c2 = idCardFactory.create("小红");
        Product c3 = idCardFactory.create("小刚");

        c1.use();
        c2.use();
        c3.use();


    }


}

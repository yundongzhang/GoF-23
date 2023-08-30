package com.isyundong.gof23.factorymetod;

import java.util.UUID;

public class IDCard extends Product {

    private final String owner;

    private final String number;

    IDCard(String owner) {
        System.out.println("制作 " + owner + " 的 ID 卡。编号: " + (number = UUID.randomUUID().toString()));
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("使用 " + owner + " 的 ID 卡。编号: " + number);
    }

    public String getOwner() {
        return owner;
    }
}

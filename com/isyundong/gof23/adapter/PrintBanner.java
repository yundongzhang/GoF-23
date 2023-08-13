package com.isyundong.gof23.adapter;

public class PrintBanner extends Banner implements Print {

    public PrintBanner(String String) {
        super(String);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }

}

package com.isyundong.gof23.singleton;

public class TicketMaker {

    private int ticket = 1000;

    private static TicketMaker ticketMaker = new TicketMaker();

    private TicketMaker() {

    }

    public static int getNextTicketNumber() {
        return ticketMaker.nextTicketNumber();
    }

    private int nextTicketNumber() {
        return ticket++;
    }

}

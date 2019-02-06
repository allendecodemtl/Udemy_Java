package com.github.allendecodemtl.L_01_Collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Olympia", 8,12);

        if(theatre.reserveSeat("D12")){
            System.out.println("Please pay for D12");
        } else {
            System.out.println("Sorry seat is taken");
        }

        if(theatre.reserveSeat("D12")){
            System.out.println("Please pay for D12");
        } else {
            System.out.println("Sorry seat is taken");
        }

        if(theatre.reserveSeat("D13")){
            System.out.println("Please pay for D13");
        } else {
            System.out.println("Sorry seat is taken");
        }

        List<Theatre.Seat> reverseSeat = new ArrayList<>(theatre.getSeats());
        Collections.reverse(reverseSeat);
        printList(reverseSeat);

        List<Theatre.Seat> priceSeat = new ArrayList<>(theatre.getSeats());
        priceSeat.add(theatre.new Seat("B00", 13.00));
        priceSeat.add(theatre.new Seat("A00", 13.00));
        Collections.sort(priceSeat, Theatre.PRICE_ORDER);
        printList(priceSeat);

    }

    public static void printList(List<Theatre.Seat> list){
        for (Theatre.Seat seat : list){
            System.out.print(" " + seat.getSeatNumber() + " $" + seat.getPrice());
        }
        System.out.println();
        System.out.println("======================================================");
    }

}

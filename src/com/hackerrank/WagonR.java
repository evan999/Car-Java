package com.hackerrank;

public class WagonR extends Car {
    private int mileage;

    public WagonR(Boolean isSedan, String seats, int mileage){
        super(isSedan, seats);
        this.isSedan = false;
        this.seats = seats;
        this.mileage = mileage;
    }

    public String getMileage(){
        return mileage + " kmpl.";
    }
}

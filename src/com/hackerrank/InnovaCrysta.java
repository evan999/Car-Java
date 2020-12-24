package com.hackerrank;

public class InnovaCrysta extends Car {
    private int mileage;

    public InnovaCrysta(Boolean isSedan, String seats, int mileage){
        super(isSedan, seats);
        this.isSedan = false;
        this.seats = seats;
        this.mileage = mileage;
    }

    public String getMileage(){
        return mileage + " kmpl.";
    }
}

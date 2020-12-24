package com.hackerrank;

public class HondaCity extends Car {
    private int mileage;

    public HondaCity(Boolean isSedan, String seats, int mileage){
        super(isSedan, seats);
        this.isSedan = true;
        this.seats = seats;
        this.mileage = mileage;
    }

    public String getMileage(){
        return mileage + " kmpl.";
    }
}

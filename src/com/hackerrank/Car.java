package com.hackerrank;

public abstract class Car {
    public Boolean isSedan;
    public String seats;

    public Car(Boolean isSedan, String seats){
        this.isSedan = false;
        this.seats = seats;
    }

    public Boolean getIsSedan(){
        return isSedan;
    }

    public String getSeats(){
        return seats;
    }

    public abstract String getMileage();
}

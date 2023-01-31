package com.grabukm.Model;

public class Transaction extends Booking {
    private double price;
    private Driver driver;

    public Transaction(String from,String to,int num, double price, Driver driver){
        super(from,to,num);
        this.price= price;
        this.driver = driver;
    }

    public double getPrice() {
        return price;
    }
}

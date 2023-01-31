package com.grabukm.Model;

public class Driver {
    private String name;
    private String plateNumber;
    private String car;

    public Driver(String n,String num,String car){
        this.name = n;
        this.plateNumber = num;
        this.car= car;
    }

    public String getName() {
        return name;
    }

    public String getCar() {
        return car;
    }

    public String getPlateNumber() {
        return plateNumber;
    }
}

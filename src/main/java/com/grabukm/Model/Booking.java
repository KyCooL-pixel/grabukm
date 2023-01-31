package com.grabukm.Model;

public class Booking {
    private String currLocation;
    private String destLocation;
    private int numOfPassegers;
    
    public Booking(String curr, String dest, int numOfPassegers){
        this.currLocation = curr;
        this.destLocation = dest;
        this.numOfPassegers = numOfPassegers;
    }

    public String getCurrLocation(){
        return currLocation;
    }

    public String getDestLocation(){
        return destLocation;
    }

    public int getNumOfPassengers(){
        return numOfPassegers;
    }
}

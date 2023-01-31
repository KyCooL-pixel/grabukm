package com.grabukm.Model;

import java.util.Arrays;
import java.util.List;

public class Location {
    private static String[] locations ={"KPZ","FTSM","FKAB","KBH","KIY","KUO","PUSANIKA","FPI","KTHO","KDO","FSSK","KIZ","KKM"};
    private static List<String> locationList;
    private String currLocation;
    private String destLocation;
    private static double rate = 1.00;
    public Location(){
        locationList = Arrays.asList(locations);
    }

    public static double getPrice(String locationA,String locationB){
        return Math.abs(locationList.indexOf(locationB) - locationList.indexOf(locationA)) * rate;
    }

    public String getCurrLocation(){
        return currLocation;
    }

    public String getDestLocation(){
        return destLocation;
    }

    public List<String> getLocationList(){
        return locationList;
    }
}

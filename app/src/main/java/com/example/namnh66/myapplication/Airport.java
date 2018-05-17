package com.example.namnh66.myapplication;

import java.sql.Time;
import java.util.Date;

public class Airport {
    public String airportName;
    public String loungeName;
    public Integer price;
    public String dayStart;
    public Integer img;

    public Airport(String airportName, String loungeName, Integer price, String dayStart, Integer img) {
        this.airportName = airportName;
        this.loungeName = loungeName;
        this.price = price;
        this.dayStart = dayStart;
        this.img = img;
    }

}

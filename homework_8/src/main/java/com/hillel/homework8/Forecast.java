package com.hillel.homework8;

public class Forecast {
    double number;
    String weeks;

    public Forecast(double number, String weeks){
        this.number = number;
        this.weeks = weeks;
    }
    public String printForecast(){
        return ( number +" " + weeks);

    }
}

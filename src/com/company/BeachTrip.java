package com.company;

public class BeachTrip extends Trip{

    int degreeCelsius;

    public BeachTrip(String c, int d, String fn, String ln, int degreeCelsius) {
        super(c, d, fn, ln);
        this.degreeCelsius = degreeCelsius;
    }

    @Override
    public String toString() {
        return "BeachTrip{" +
                "degreeCelsius=" + degreeCelsius +
                ", country='" + country + '\'' +
                ", duration=" + duration +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}


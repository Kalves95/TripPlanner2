package com.company;

public class Trip {
    String country;
    int duration;
    String firstName;
    String lastName;


    public Trip(String c, int d, String fn, String ln){
        country = c;
        duration = d;
        firstName = fn;
        lastName = ln;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "country='" + country + '\'' +
                ", duration=" + duration +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}

package com.company;

public class SkiTrip extends Trip {

    boolean coach;

    public SkiTrip(String c, int d, String fn, String ln, boolean coach) {
        super(c, d, fn, ln);
        this.coach = coach;
    }

    @Override
    public String toString() {
        return "SkiTrip{" +
                "coach=" + coach +
                ", country='" + country + '\'' +
                ", duration=" + duration +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}


package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        ArrayList<Trip> trips = new ArrayList();

        System.out.println("Hello There!");
        menu(console, trips);

    }

    public static void createTrip(Scanner scan, ArrayList<Trip> trips) {
        System.out.println("Enter destination");
        String c = scan.next();
        System.out.println("Enter duration");
        int d = scan.nextInt();
        System.out.println("Enter First Name");
        String fn = scan.next();
        System.out.println("Enter Last Name");
        String ln = scan.next();

        Trip t1 = new Trip(c, d, fn, ln);
        trips.add(t1);
    }

    public static void createSkiTrip(Scanner scan, ArrayList<Trip> trips) {
        System.out.println("Enter destination");
        String c = scan.next();
        System.out.println("Enter duration");
        int d = scan.nextInt();
        System.out.println("Enter First Name");
        String fn = scan.next();
        System.out.println("Enter Last Name");
        String ln = scan.next();
        System.out.println("Do you need a ski coach");
        boolean co = scan.nextBoolean();

        SkiTrip st1 = new SkiTrip(c, d, fn, ln, co);
        trips.add(st1);
    }

    public static void createBeachTrip(Scanner scan, ArrayList<Trip> trips) {
        System.out.println("Enter destination");
        String c = scan.next();
        System.out.println("Enter duration");
        int d = scan.nextInt();
        System.out.println("Enter First Name");
        String fn = scan.next();
        System.out.println("Enter Last Name");
        String ln = scan.next();
        System.out.println("Enter Degree celsius");
        int de = scan.nextInt();

        BeachTrip bt1 = new BeachTrip(c, d, fn, ln, de);
        trips.add(bt1);
    }

    public static void menu(Scanner scan, ArrayList<Trip> trips) {
        boolean flag = true;
        System.out.println("Welcome to Trip creator");
        System.out.println("Enter 1 to create Trip");
        System.out.println("Enter 2 to create SkiTrip");
        System.out.println("Enter 3 to create BeachTrip");
        System.out.println("Enter 4 to show trip list");
        System.out.println("-1 to leave menu");
        while (flag) {
            switch (scan.nextInt()) {
                case 1 -> {
                    System.out.println("You've chosen to create a Trip");
                    createTrip(scan, trips);
                    System.out.println("Enter 1 to create Trip");
                    System.out.println("Enter 2 to create SkiTrip");
                    System.out.println("Enter 3 to create BeachTrip");
                    System.out.println("Enter 4 to show trip list");
                    System.out.println("-1 to leave menu");
                }
                case 2 -> {
                    System.out.println("You've chosen to create a SkiTrip");
                    createSkiTrip(scan, trips);
                    System.out.println("Enter 1 to create Trip");
                    System.out.println("Enter 2 to create SkiTrip");
                    System.out.println("Enter 3 to create BeachTrip");
                    System.out.println("Enter 4 to show trip list");
                    System.out.println("-1 to leave menu");
                }
                case 3 -> {
                    System.out.println("You've chosen to create a BeachTrip");
                    createBeachTrip(scan, trips);
                    System.out.println("Enter 1 to create Trip");
                    System.out.println("Enter 2 to create SkiTrip");
                    System.out.println("Enter 3 to create BeachTrip");
                    System.out.println("Enter 4 to show trip list");
                    System.out.println("-1 to leave menu");
                }
                case 4 -> {
                    System.out.println("You've chosen to print list");
                    System.out.println(trips + "\n");
                    System.out.println("Enter 1 to create Trip");
                    System.out.println("Enter 2 to create SkiTrip");
                    System.out.println("Enter 3 to create BeachTrip");
                    System.out.println("Enter 4 to show trip list");
                    System.out.println("-1 to leave menu");
                }
                case -1 -> flag = false;
                default -> throw new IllegalStateException("Unexpected value: " + scan.nextInt());
            }
        }
    }
}

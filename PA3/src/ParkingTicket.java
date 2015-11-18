/**
 * Camille Nibungco
 * CS141, 01
 * Programming Assignment 3
 * 11-16-15
 * COPYRIGHT: smanna@cpp.edu
 * CS 141 Programming Assignment 3
 * --------------------------------
 * Complete this class!
 * **/

//import DecimalFormat to ensure that Fine amounts are displayed
//with 2 decimal place accuracy

import java.text.DecimalFormat;


//class header
public class ParkingTicket {
    //private fields of the car, officer, minutes, fine
    private ParkedCar car;
    private PoliceOfficer officer;
    private int minutes;
    private double fine;

    //static constant members of the class
    public static final double BASE_FINE = 25.0;
    public static final double HOURLY_FINE = 10.0;

    //constructor initializing fields by passing in each value
    public ParkingTicket(ParkedCar aCar, PoliceOfficer anOfficer, int min) {
      // TODO
        car = new ParkedCar(aCar);
        officer = new PoliceOfficer(anOfficer);
        minutes = min;
        calculateFine();
    }

    //copy constructor, which copies the fields of the argument object
    public ParkingTicket(ParkingTicket ticket2) {
      // TODO
        car = new ParkedCar(ticket2.car);
        officer = new PoliceOfficer(ticket2.officer);
        minutes = ticket2.minutes;
        calculateFine();
    }

    //determines the fine based on the minutes over the time limit
    private void calculateFine() {
      // TODO
        int hours = minutes/60;
        fine = BASE_FINE + (HOURLY_FINE * (hours));
    }

    //mutates car
    public void setCar(ParkedCar c) {
      // TODO
        car = c;
    }

    //mutates officer
    public void setOfficer(PoliceOfficer o) {
      // TODO
        officer = o;
    }

    //mutates minutes
    public void setMinutes(int m) {
      // TODO
        minutes = m;
    }

    //accesses the car
    public ParkedCar getCar() {
      // TODO
        return car;
    }

    //accesses officer
    public PoliceOfficer getOfficer() {
      // TODO
        return officer;
    }

    //accesses fine
    public double getFine() {
      // TODO
        return fine;
    }

    //returns the important information of the ticket in String format
    public String toString() {
      // TODO
        // Create a string representing the object.
        String str = "Illegally parked car info: " + car +"\nParking meter info:" + minutes +"\nAmount of the fine...: " + fine +"\nPolice officer info: " + officer;

        // Return the string.
        return str;
    }


}
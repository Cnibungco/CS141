
/**
 * Camille Nibungco
 * CS 141, 01
 * Programming Assignment 3
 * 11-16-15
 * COPYRIGHT: smanna@cpp.edu
 * CS 141 Programming Assignment 3
 * --------------------------------
 * Complete this class!
 * **/

//class header
public class PoliceOfficer {
    //private fields for name and badgenumber
    private String name;
    private String badgeNumber;

    //constructor for policeofficer to initialize fields
    public PoliceOfficer(String n, String bn) {
      // TODO
        name = n;
        badgeNumber = bn;
    }

    //copy constructor for policeofficer, copies argument object's fields
    public PoliceOfficer(PoliceOfficer officer2) {
      // TODO
        name = officer2.name;
        badgeNumber = officer2.badgeNumber;
    }

    //mutates name
    public void setName(String n) {
      // TODO
        name = n;
    }

    //mutates badgenumber
    public void setBadgeNumber(String bn) {
      // TODO
        badgeNumber = bn;
    }

    //accesses name
    public String getName() {
      // TODO
        return name;
    }

    //accesses badgenumber
    public String getBadgeNumber() {
      // TODO
        return badgeNumber;
    }

    //performs a comparison of the car's parked minutes and
    //minutes purchased off of meter
    //issues parking ticket if appropriate
    public ParkingTicket patrol(ParkedCar car, ParkingMeter meter) {
      // TODO
        // Calculate the total number of minutes parked over minutes
        // purchased
        int illegalMinutes = car.getMinutesParked() - meter.getMinutesPurchased();

        // if illegalMinutes, give ticket
        if (illegalMinutes > 0) {
            // Yes, it is illegally parked.
            ParkingTicket ticket = new ParkingTicket(car, this, illegalMinutes);
            return ticket;
        }
        else{
            return null;
        }
    }

    //returns information about Officer in string format
    public String toString() {
      // TODO
        String str = "\nOfficer name: " + name +
                "\nBadge number: " + badgeNumber;
        return str;
    }
}
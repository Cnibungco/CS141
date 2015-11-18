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

//class header
public class ParkedCar {
    //private fields for a parked car - make, model, color,
    //license number and minutes parked
    private String make;
    private String model;
    private String color;
    private String licenseNumber;
    private int minutesParked;

    //first constructor involves passing each individual argument
    public ParkedCar(String mk, String mod, String col, String lic, int min) {
      // TODO
        make = mk;
        model = mod;
        color = col;
        licenseNumber = lic;
        minutesParked = min;
    }

    //this is the copy constructor, which copies the fields from the argument
    public ParkedCar(ParkedCar car2) {
      // TODO
        make = car2.make;
        model = car2.model;
        color = car2.color;
        licenseNumber = car2.licenseNumber;
        minutesParked = car2.minutesParked;
    }

    //mutates the make of car
    public void setMake(String m) {
      // TODO
        make = m;
        
    }

    //mutates the model of car
    public void setModel(String m) {
      // TODO
        model = m;
    }

    //mutates the color of car
    public void setColor(String c) {
      // TODO
        color = c;
    }

    //mutates the licenseNumber of car
    public void setLicenseNumber(String l) {
      // TODO
        licenseNumber = l;
    }

    //mutates the minutesparked of car
    public void setMinutesParked(int m) {
      // TODO
        minutesParked = m;
    }

    //accesses the make of car
    public String getMake() {   
      // TODO
        return make;
    }

    //accesses the model of car
    public String getModel() {
      // TODO
        return model;
    }

    //accesses the color of car
    public String getColor() {
      // TODO
        return color;
    }

    //accesses the licenseNumber of car
    public String getLicenseNumber() {
      // TODO
        return licenseNumber;
    }

    //accesses the minutesParked of car
    public int getMinutesParked() {
      // TODO
        return minutesParked;
    }

    //returns the appropriate information of the car object in string form
    public String toString() {
        // TODO
        String str = "Parked car's make.....................: " + make +
                "\nParked car's model..................: " + model +
                "\nParked car's color..................: " + color +
                "\nParked car's license plate number...: " + licenseNumber +
                "\nMinutes that the car has been parked: " + minutesParked;

// Return the string.
        return str;
    }

}
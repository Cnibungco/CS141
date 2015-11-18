/**
 * COPYRIGHT: smanna@cpp.edu
 * CS 141 Programming Assignment 3
 * ---------------------------------
 * PLEASE DO NOT CHANGE THIS CODE!
 * 
 **/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class GenerateScore {
    private static ArrayList<String> fromFile;
    private static int counter = 0;

    public static void main(String[] args) {
        File file = null;
        try {
            if (args.length > 0)
                file = new File("eval/eval.txt");
            else
                file = new File("data/test.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }

        readFromFile(file);

        int score = 0;
        int classScore = 0;

        ParkingTicket pt1 = null, pt2 = null;
        ParkedCar pc1 = null, pc2 = null;
        PoliceOfficer po1 = null, po2 = null;

        System.out.println("Testing ParkedCar class...");
        try {
            String string = getNext();
            String string1 = getNext();
            String string2 = getNext();
            String string3 = getNext();
            int int1 = Integer.parseInt(getNext());

            pc1 = new ParkedCar(string, string1, string2, string3, int1);
            pc2 = new ParkedCar(pc1);


            String pc1String = pc1.toString();

            if (pc1String.contains(string)) {
                displayPlusOneMessage();
                classScore++;
            } else {
                System.out.println("ParkedCar toString doesn't contain car make...+0pts");
            }

            if (pc1String.contains(string1)) {
                displayPlusOneMessage();
                classScore++;
            } else {
                System.out.println("ParkedCar toString doesn't contain car model...+0pts");
            }

            if (pc1String.contains(string2)) {
                displayPlusOneMessage();
                classScore++;
            } else {
                System.out.println("ParkedCar toString doesn't contain car color...+0pts");
            }

            if (pc1String.contains(string3)) {
                displayPlusOneMessage();
                classScore++;
            } else {
                System.out.println("ParkedCar toString doesn't contain car license...+0pts");
            }

            if (pc1String.contains(String.valueOf(int1))) {
                displayPlusOneMessage();
                classScore++;
            } else {
                System.out.println("ParkedCar toString doesn't contain car minutesparked...+0pts");
            }


            if (pc1.getMake().equals(pc2.getMake())) {
                displayPlusOneMessage();
                classScore++;
            } else {
                System.out.println("Parked Car Make's not equal after using copy constructor! +0 pts");
            }

            if (pc1.getModel().equals(pc2.getModel())) {
                displayPlusOneMessage();
                classScore++;
            } else {
                System.out.println("Parked Car's Model not equal after using copy constructor! +0pts");
            }

            if (pc1.getColor().equals(pc2.getColor())) {
                displayPlusOneMessage();
                classScore++;
            } else {
                System.out.println("Parked Car's Color not equal after using copy constructor! +0pts");
            }

            if (pc1.getLicenseNumber().equals(pc2.getLicenseNumber())) {
                displayPlusOneMessage();
                classScore++;
            } else {
                System.out.println("Parked Car's license numbers not equal after using copy constructor! +0pts");
            }

            if (pc1.getMinutesParked() == pc2.getMinutesParked()) {
                displayPlusOneMessage();
                classScore++;
            } else {
                System.out.println("Parked Car's Minutes Parked not equal after using copy constructor! +0pts");
            }

            String color = getNext();
            pc1.setColor(color);
            if (!pc1.getColor().equals(pc2.getColor()) && pc1.getColor().equals(color)) {
                displayPlusOneMessage();
                classScore++;
            } else {
                System.out.println("Parked Car's Color method(s) not working correctly! +0pts");
            }

            String make = getNext();
            pc1.setMake(make);

            if (!pc1.getMake().equals(pc2.getMake()) && pc1.getMake().equals(make)) {
                displayPlusOneMessage();
                classScore++;
            } else {
                System.out.println("Parked Car's Make method(s) not working correctly! +0pts");
            }


            String model = getNext();
            pc1.setModel(model);

            if (!pc1.getModel().equals(pc2.getModel()) && pc1.getModel().equals(model)) {
                displayPlusOneMessage();
                classScore++;
            } else {
                System.out.println("Parked Car's Model method(s) not working correctly! +0pts");
            }

            String license = getNext();
            pc1.setLicenseNumber(license);
            if (!pc1.getLicenseNumber().equals(pc2.getLicenseNumber()) && pc1.getLicenseNumber().equals(license)) {
                displayPlusOneMessage();
                classScore++;
            } else {
                System.out.println("Parked Car's License Number method(s) not working correctly... +0pts");
            }

            int num = Integer.parseInt(getNext());
            pc1.setMinutesParked(num);
            if ((pc1.getMinutesParked() != pc2.getMinutesParked()) && (pc1.getMinutesParked() == num)) {
                displayPlusOneMessage();
                classScore++;
            } else {
                System.out.println("Parked Car's License Number method(s) not working correctly... +0pts");
            }

        } catch (Exception e) {
            System.out.println("Error in ParkedCar class");
            counter = 10;
            e.printStackTrace();
        }










        System.out.println("class score: " + classScore + "/15 ");
        score += classScore;
        classScore = 0;

        System.out.println("\n\nTesting PoliceOfficer class...");
        try {
            String string = getNext();
            String string1 = getNext();
            po1 = new PoliceOfficer(string, string1);
            po2 = new PoliceOfficer(po1);

            String po1String = po1.toString();

            if (po1String.contains(string)) {
                displayPlusOneMessage();
                classScore++;
            } else {
                System.out.println("PoliceOfficer toString doesn't contain officer name...+0pts");
            }

            if (po1String.contains(string1)) {
                displayPlusOneMessage();
                classScore++;
            } else {
                System.out.println("PoliceOfficer toString doesn't contain officer badgenumber...+0pts");
            }


            if (po1.getName().equals(po2.getName())) {
                displayPlusOneMessage();
                classScore++;
            } else {
                System.out.println("PoliceOfficer's names not equal after using copy constructor...+0pts");
            }

            if (po1.getBadgeNumber().equals(po2.getBadgeNumber())) {
                displayPlusOneMessage();
                classScore++;
            } else {
                System.out.println("PoliceOfficer's badgeNumbers not equal after using copy constructor...+0pts");
            }

            String string2 = getNext();
            po1.setName(string2);

            if (!po1.getName().equals(po2.getName()) && po1.getName().equals(string2)) {
                displayPlusOneMessage();
                classScore++;
            } else {
                System.out.println("PoliceOfficer's Name method(s) not working correctly... +0pts");
            }

            String string3 = getNext();
            po1.setBadgeNumber(string3);
            if (!po1.getBadgeNumber().equals(po2.getBadgeNumber()) && po1.getBadgeNumber().equals(string3)) {
                displayPlusOneMessage();
                classScore++;
            } else {
                System.out.println("PoliceOfficer's badgeNumber method(s) not working correctly... +0pts");
            }

        } catch (Exception e) {
            System.out.println("Error in PoliceOfficer class");
            e.printStackTrace();
            counter = 14;
        }
        System.out.println("class score: " + classScore + "/6 ");
        score += classScore;







        classScore = 0;
        System.out.println("\n\nTesting ParkingTicket class...");
        try {
            pt1 = new ParkingTicket(pc1, po1, 1);
            pt2 = new ParkingTicket(pt1);

            String string = getNext();
            pc1.setModel(string);

            if (!pt1.getCar().getModel().equals(pc1.getModel())) {
                displayPlusOneMessage();
                classScore++;
            } else {
                System.out.println("ParkingTicket has a shallow copy of its ParkedCar member... +0pts");
            }

            String string1 = getNext();
            po1.setName(string1);

            if (!pt1.getOfficer().getName().equals(po1.getName())) {
                displayPlusOneMessage();
                classScore++;
            } else {
                System.out.println("ParkingTicket has a shallow copy of its PoliceOfficer member... +0pts");
            }

            String string2 = getNext();
            String string3 = getNext();
            pt2.getCar().setModel(string2);
            pt2.getOfficer().setName(string3);

            if (!pt1.getCar().getModel().equals(pt2.getCar().getModel())) {
                displayPlusOneMessage();
                classScore++;
            } else {
                System.out.println("ParkingTicket has a shallow copy of its ParkedCar member... +0pts");
            }

            if (!pt1.getOfficer().getName().equals(pt2.getOfficer().getName())) {
                displayPlusOneMessage();
                classScore++;
            } else {
                System.out.println("ParkingTicket has a shallow copy of its PoliceOfficer member... +0pts");
            }

        } catch (Exception e) {
            System.out.println("Error in ParkingTicket class");
            e.printStackTrace();
            counter = 18;
        }
        System.out.println("class score: " + classScore + "/4 ");
        if (classScore < 4) {
            System.out.println("If you're losing points here look in to shallow copies"
                    + " vs. deep copies, there is a reason for copy constructors\n"
                    + "Also, ParkingTicket methods should return the exact objects it's fields hold");
        }
        score += classScore;





        classScore = 0;
        System.out.println("\n\nTesting ParkingMeter class...");
        try {
            int int1 = Integer.parseInt(getNext());

            ParkingMeter parkingMeter = new ParkingMeter(int1);
            if (parkingMeter.getMinutesPurchased() == int1) {
                displayPlusOneMessage();
                classScore++;
            } else {
                System.out.println("Parking Meter minutes purchased method(s) not working...+0pts");
            }

            int int2 = Integer.parseInt(getNext());
            parkingMeter.setMinutesPurchased(int2);
            if (parkingMeter.getMinutesPurchased() == int2) {
                displayPlusOneMessage();
                classScore++;
            } else {
                System.out.println("Parking Meter setMinutesPurchased method(s) not working...+0pts");
            }

        } catch (Exception e) {
            System.out.println("Error in ParkingMeter class");
            e.printStackTrace();
            counter = 20;
        }
        System.out.println("class score: " + classScore + "/2 ");
        score += classScore;





        classScore = 0;
        System.out.println("\n\nTesting patrol method");
        try {
            int int1 = Integer.parseInt(getNext());
            int int2 = Integer.parseInt(getNext());
            ParkingMeter parkingMeter = new ParkingMeter(int1);
            ParkedCar parkedCar = new ParkedCar("1", "1", "1", "1", int2);
            PoliceOfficer policeOfficer = new PoliceOfficer("1", "1");

            ParkingTicket parkingTicket = policeOfficer.patrol(parkedCar, parkingMeter);
            if (parkingTicket != null) {
                displayPlusOneMessage();
                classScore++;
                if (parkingTicket.getFine() == 25) {
                    displayPlusOneMessage();
                    classScore++;
                } else {
                    System.out.println("Bad parking fine calculation");
                }
            } else {
                System.out.println("Police officer patrol method incorrect. You didn't assign a parking ticket when appropriate. +0pts");
            }

            int int3 = Integer.parseInt(getNext());
            int int4 = Integer.parseInt(getNext());
            parkingMeter.setMinutesPurchased(int3);
            parkedCar.setMinutesParked(int4);
            parkingTicket = policeOfficer.patrol(parkedCar, parkingMeter);
            if (parkingTicket == null) {
                displayPlusOneMessage();
                classScore++;
            } else {
                System.out.println("Police officer patrol method incorrect. You assigned a parking ticket when you didn't have to. +0pts");
            }

            int int5 = Integer.parseInt(getNext());
            int int6 = Integer.parseInt(getNext());
            parkingMeter.setMinutesPurchased(int5);
            parkedCar.setMinutesParked(int6);
            parkingTicket = policeOfficer.patrol(parkedCar, parkingMeter);
            if (parkingTicket != null) {
                displayPlusOneMessage();
                classScore++;
                if (parkingTicket.getFine() == 35) {
                    displayPlusOneMessage();
                    classScore++;
                } else {
                    System.out.println("Bad parking fine calculation");
                }
            } else {
                System.out.println("Police officer patrol method incorrect. You didn't assign a parking ticket when appropriate. +0pts");
            }


        } catch (Exception e) {
            System.out.println("Error in patrol method");
            counter = 26;
            e.printStackTrace();
        }
        score += classScore;


        System.out.println("Total score: " + score + "/32");
    }

    private static void readFromFile(File input) {
        Scanner scanner = null;
        ArrayList<String> result = new ArrayList<>();
        try {
            scanner = new Scanner(input);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.equals("")) {
                break;
            }
            result.add(line);
        }
        fromFile = result;
    }

    private static void displayPlusOneMessage() {
        System.out.println("Passed test... +1 pts");
    }

    private static String getNext() {
        return fromFile.get(counter++);
    }
}

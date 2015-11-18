/**
 * COPYRIGHT: smanna@cpp.edu
 * CS 141 | Assignment 2
 *---------------------------------------
 * You have to implement this class.
 * Feel free to add your own fields and 
 * methods, but do not change the method
 * signatures provided in this class.
 * --------------------------------------
 **/
import java.text.DecimalFormat;

public class Temperature
{

   public double degrees;

   public char scale;

   /**
    * No args constructor for temperature
    */
   public Temperature()
   {
         degrees = 0.0;
         scale = 'C';
   }

   /**
    * Constructor for temperature given the value for degrees
    * @param degrees the initial value to set degrees to
    */
   public Temperature(double Degrees)
   {
         degrees = Degrees;
         scale = 'C';
   }

   /**
    * Constructor for temperature given the value for scale, set to C if invalid
    * characte
    * @param scale the initial value to set scale to
    */
   public Temperature(char Scale)
   {
         degrees= 0.0;
         if (Scale == 'F' || Scale == 'f' || Scale == 'C' || Scale == 'c')
            scale = Scale;
         else
            scale = 'C';
   }

   /**
    * Constructor for temperature given the value for degrees and scale
    * @param degrees the initial value to set degrees to
    * @param scale the initial value to set scale to
    */
   public Temperature(double Degrees, char Scale)
   {
         degrees = Degrees;
       if (Scale == 'F' || Scale == 'f' || Scale == 'C' || Scale == 'c')
           scale = Scale;
         else
           scale = 'C';
   }

   /**
    * @return the degrees field in the form of degrees Fahrenheit
    */
   public double getTemperatureFahrenheit()
   {
       if (scale == 'C' || scale == 'c') {
           return (9*degrees/5) + 32;
       }
       else {
           return degrees;
       }

   }

   /**
    * @return the degrees field in the form of degrees Celsius
    */
   public double getTemperatureCelsius()
   {
       if (scale == 'f' || scale == 'F') {
           return  5*(degrees-32)/9;
       }
       else {
           return degrees;
       }
   }

   /**
    * sets the degrees to the value supplied
    * @param degrees the new value to set degrees to
    */
   public void setDegrees(double Degrees)
   {
       degrees = Degrees;
   }

   /**
    * sets the scale to the value supplied
    * @param scale the new value to set the scale to
    */
   public void setScale(char Scale)
   {
       if (Scale == 'F' || Scale == 'f' || Scale == 'C' || Scale == 'c')
           scale = Scale;
       else
           scale = 'C';
   }

   /**
    * sets the temperature and scale to the values supplied
    * @param degrees the new value to set degrees to
    * @param scale the new value to set the scale to
    */
   public void setDegreesScale(double Degrees, char Scale)
   {
        degrees = Degrees;
       if (Scale == 'F' || Scale == 'f' || Scale == 'C' || Scale == 'c')
           scale = Scale;
       else
           scale = 'C';

   }

    private char checkScale(char scale){
        if (scale == 'F' || scale =='f')
            return scale = 'F';
        else
            return scale = 'C';
    }
   /**
    * checks whether this temperature is equal to temperature 2
    * @param temp2 the temperature to compare this Temperature to
    * @return
    */
   public boolean equals(Temperature temp2)
   {
       double tempDegrees = degrees;
       char temp2scale = checkScale(temp2.scale);
       char tempscale = checkScale(scale);
       if (temp2scale == tempscale)
       {
           if (temp2.degrees == tempDegrees){
            return true;
           }
           else {
               return false;
           }
       }
       else{
           if (tempscale == 'F')
               tempDegrees = getTemperatureCelsius();
           else
               tempDegrees = getTemperatureFahrenheit();
           if (tempDegrees == temp2.degrees)
               return true;
           else
               return false;
       }
   }

   /**
    * checks whether this temperature is greater than temperature 2
    * @param temp2 the temperature to compare this Temperature to
    * @return whether this temperature is greater than temperature 2
    */
   public boolean greaterThan(Temperature temp2)
   {
       double tempDegrees = degrees;
       char temp2scale = checkScale(temp2.scale);
       char tempscale = checkScale(scale);
       if (temp2scale == tempscale)
       {
           if (temp2.degrees > tempDegrees){
               return true;
           }
           else {
               return false;
           }
       }
       else {
           if (tempscale == 'F')
               tempDegrees = getTemperatureCelsius();
           else
               tempDegrees = getTemperatureFahrenheit();
           if (tempDegrees > temp2.degrees)
               return true;
           else
               return false;
            }
   }

   /**
    * checks whether this temperature is less than temperature 2
    * @param temp2 the temperature to compare this Temperature to
    * @return whether this temperature is less than temperature 2
    */
   public boolean lessThan(Temperature temp2)
   {
       double tempDegrees = degrees;
       char temp2scale = checkScale(temp2.scale);
       char tempscale = checkScale(scale);
       if (temp2scale < tempscale)
       {
           if (temp2.degrees == tempDegrees){
               return true;
           }
           else {
               return false;
           }
       }
       else {
           if (tempscale == 'F')
               tempDegrees = getTemperatureCelsius();
           else
               tempDegrees = getTemperatureFahrenheit();
           if (tempDegrees < temp2.degrees)
               return true;
           else
               return false;
       }
   }

   @ Override
   /**
    * this is already done for you
    * @return the Temperature object as a String of the format
    * #,##0.0 C or #,##0.0 F
    */
   public String toString()
   {
      DecimalFormat formatter = new DecimalFormat("#,##0.0");
      String value = formatter.format(degrees) + " " + scale;
      return value;
   }
}

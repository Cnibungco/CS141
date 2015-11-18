/**
 * Camille Nibungco
 * CS141 - 01
 * Programming Assignment 1
 * 10-17-15
 * COPYRIGHT: smanna@cpp.edu
 * CS 141-01
 * Programming Assignment 1
 *
 * STUDENTS SHOULD COMPLETE THIS CODE.
 * You will upload this code to Blackboard.
 *
 * Feel free to include your private fields and methods.
 * But please make sure you do not change the signature
 * of the public methods provided. If you do so, your code
 * cannot be run automatically, and you will not be graded.
 *
 * If you do not write enough comments, atleast two points
 * will be deducted from your assignment. Also make sure you
 * follow the coding conventions.
 *
 **/

import java.io.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Review
{
    //mention that students should return new int[0] if input is negative
    public static void main(String[] args) throws IOException
    {

        // Ask user for array size
        Scanner kb = new Scanner(System.in);
        System.out.print("Please enter array size: ");
        //Construct array
        int size = kb.nextInt()+1;
        int[] a;
        //catch negative input
        if (size <= 0)
        {
            a = new int[0];
        }
        else
        {
            a = new int[size];
        }
        // Loop to get array input
        for(int i=1; i < a.length; i++)
        {
            System.out.println("enter element "+i+" :");
            a[i]=kb.nextInt();
        }
        //Call methods
        loadArray();
        output(a);
    }

    public static int[] loadArray() {
        return null; // make changes to the return type as needed
    }

    public static void output(int[] a) throws IOException
    {
     // Print array into data.txt
        BufferedWriter outputWriter = null;
        outputWriter = new BufferedWriter(new FileWriter("data.txt"));
        //loop through ints
        for (int i=1; i < a.length; i++)
        {
            outputWriter.write(Integer.toString(a[i]));
            outputWriter.newLine();
        }
        outputWriter.flush();
        //close outputwriter
        outputWriter.close();
        //check if method is called
        System.out.println("data written to file.");
    }
}

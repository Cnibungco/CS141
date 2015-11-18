/**
 * !!! WARNING!!! Please do not alter this code.
 * This is used to generate your score.
 *
 * COPYRIGHT: smanna@cpp.edu
 * Programming Assignment 1
 * CS 141-01
 * **/

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

//mention that students should return new int[0] if input is negative
public class GenerateScore
{
    public static void main(String[] args) {
        String toConcatenate= "";
        if (args.length > 0) {
            toConcatenate= "eval";
        } else {
            toConcatenate= "data";
        }
        int score = 0;
        final int MAX_SCORE = 10;
        for (int i = 0; i < MAX_SCORE; i++) {
            try {
                System.out.println("Starting test input " + i);
                //get actual number that student should have in arraylist actualAnswer
                File filename = new File(toConcatenate + "/input" + i + ".txt");
                Scanner scanner = new Scanner(filename);
                int num = scanner.nextInt();
                ArrayList<Integer> actualAnswer = new ArrayList<>();
                for (int j = 0; j < num; j++) {
                    actualAnswer.add(scanner.nextInt());
                }
                scanner.close();

                //save old inputstream, and set input to file, call student code
                InputStream oldInput = System.in;
                PrintStream oldOut = System.out;
                PrintStream discardOutput = new PrintStream(new ByteArrayOutputStream());
                System.setIn(new FileInputStream(filename));
                System.setOut(discardOutput);

                Review.main(null);

                System.setIn(oldInput);
                System.setOut(oldOut);

                //get arraylist from student file
                scanner = new Scanner(new File("data.txt"));
                ArrayList<Integer> studentAnswer = new ArrayList<>();
                for (int j = 0; j < num; j++) {
                    studentAnswer.add(scanner.nextInt());
                }
                System.out.println("Expecting " + actualAnswer);
                System.out.println("Got " + studentAnswer);
                //verify
                if (scanner.hasNext() && !scanner.nextLine().equals("")) {
                    displayErrorMessage(i);
                    continue;
                } else {
                    boolean continueToNextIteration = false;
                    for (int j = 0; j < actualAnswer.size(); j++) {
                        if (!actualAnswer.get(j).equals(studentAnswer.get(j))) {
                            displayErrorMessage(i);
                            continueToNextIteration = true;
                            break;
                        }
                    }
                    if (continueToNextIteration) {
                        continue;
                    } else {
                        System.out.println("Passed input" + i + ".txt");
                        score++;
                    }
                }
            } catch (Exception e) {
                System.out.println("YOU HAD AN EXCEPTION!!");
                displayErrorMessage(i);
                e.printStackTrace();
            } finally {
                System.out.println();
            }
        }
        System.out.println("Your score was: " + score + " out of " + MAX_SCORE);
    }

    public static void displayErrorMessage(int i) {
        System.out.println("Failed on input" + i + ".txt");
    }
}

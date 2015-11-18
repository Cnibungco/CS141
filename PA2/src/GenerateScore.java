/**
 * COPYRIGHT: smanna@cpp.edu
 * CS 141 | Assignment 2
 *
 * ----------------------------------
 * !!WARNING!! PLEASE DO NOT MODIFY
 * THIS CODE.
 * ----------------------------------
 **/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class GenerateScore
{

   private static double score = 0.0;
   private static ArrayList<String> variables;
   private static int index = 0;

   public static void main(String[] args) throws FileNotFoundException
   {
      score = 0.0;
      int test = 1;
      Scanner file;
      if (args.length > 0){
         file = new Scanner(new File("eval/eval.txt"));
         System.out.println("using eval...");
      }else {
         file = new Scanner(new File("data/test.txt"));
         System.out.println("using test...");
      }


      variables = new ArrayList<>();

      while (file.hasNextLine())
      {
         variables.add(file.nextLine());
      }
      file.close();

      try
      {
          //read first four strings
         Temperature t1 = new Temperature();
         Temperature t2 = new Temperature(nextNum());
         Temperature t3 = new Temperature(nextChar());
         Temperature t4 = new Temperature(nextNum(),nextChar());

         //checks against next four strings
         testStringMethod(t1);
         System.out.println("test: " + test++);
         testStringMethod(t2);
         System.out.println("test: " + test++);
         testStringMethod(t3);
         System.out.println("test: " + test++);
         testStringMethod(t4);
         System.out.println("test: " + test++);

          //check next four strings
         testFMethod(t1);
         System.out.println("test: " + test++);
         testFMethod(t2);
         System.out.println("test: " + test++);
         testCMethod(t3);
         System.out.println("test: " + test++);
         testCMethod(t4);
         System.out.println("test: " + test++);

         while (index < variables.size())
         {
            testSetDMethod(t1,nextNum());
            System.out.println("test: " + test++);
            testSetSMethod(t1,nextChar());
            System.out.println("test: " + test++);
            testEqualsMethod(t1,t2,nextBool());
            System.out.println("test: " + test++);

            testSetDSMethod(t3,nextNum(),nextChar());
            System.out.println("test: " + test++);
            testLessMethod(t4,t3,nextBool());
            System.out.println("test: " + test++);

            testSetDSMethod(t2,nextNum(),nextChar());
            System.out.println("test: " + test++);
            testSetDSMethod(t4,nextNum(),nextChar());
            System.out.println("test: " + test++);
            testGreatMethod(t2,t4,nextBool());
            System.out.println("test: " + test++);
         }


      } catch (Exception e)
      {
         e.printStackTrace();
      }

      System.out.println("Score: " + (score/40.0 * 100.0));
   }

   private static boolean testStringMethod(Temperature t)
   {
      try
      {
         if (t.toString().equals(nextLine()))
         {
            score++;
            return true;
         }
      } catch (Exception e)
      {
         e.printStackTrace();

         return false;
      }
      return false;
   }

   private static boolean testFMethod(Temperature t)
   {
      try
      {
         if (t.getTemperatureFahrenheit() == nextNum())
         {
            score++;
            return true;
         }
      } catch (Exception e)
      {
         e.printStackTrace();
         return false;
      }
      return false;
   }

   private static boolean testCMethod(Temperature t)
   {
      try
      {
         if (t.getTemperatureCelsius() == nextNum())
         {
            score++;
            return true;
         }
      } catch (Exception e)
      {
         e.printStackTrace();
         return false;
      }
      return false;
   }

   private static boolean testSetDMethod(Temperature t, double d)
   {
      try
      {
         t.setDegrees(d);
         if (t.degrees == d)
         {
            score++;
            return true;
         }
      } catch (Exception e)
      {
         e.printStackTrace();
         return false;
      }
      return false;
   }

   private static boolean testSetSMethod(Temperature t, char s)
   {
      try
      {
         t.setScale(s);
         if (t.scale == s)
         {
            score++;
            return true;
         }
      } catch (Exception e)
      {
         e.printStackTrace();
         return false;
      }
      return false;
   }

   private static boolean testSetDSMethod(Temperature t, double d, char s)
   {
      try
      {
         t.setDegreesScale(d, s);
         if (t.degrees == d && t.scale == s)
         {
            score++;
            return true;
         }
      } catch (Exception e)
      {
         e.printStackTrace();
         return false;
      }
      return false;
   }

   private static boolean testEqualsMethod(Temperature t1, Temperature t2, boolean actual)
   {
      try
      {
         if (t1.equals(t2) == actual)
         {
            score++;
            return true;
         }
      } catch (Exception e)
      {
         e.printStackTrace();
         return false;
      }
      return false;
   }

   private static boolean testLessMethod(Temperature t1, Temperature t2, boolean actual)
   {
      try
      {
         if (t1.lessThan(t2) == actual)
         {
            score++;
            return true;
         }
      } catch (Exception e)
      {
         e.printStackTrace();
         return false;
      }
      return false;
   }

   private static boolean testGreatMethod(Temperature t1, Temperature t2, boolean actual)
   {
      try
      {
         if (t1.greaterThan(t2) == actual)
         {
            score++;
            return true;
         }
      } catch (Exception e)
      {
         e.printStackTrace();
         return false;
      }
      return false;
   }

   private static double nextNum()
   {
      return Double.parseDouble(variables.get(index++));
   }

   private static char nextChar()
   {
      return variables.get(index++).charAt(0);
   }

   private static boolean nextBool()
   {
      return Boolean.parseBoolean(variables.get(index++));
   }

   private static String nextLine()
   {
      return variables.get(index++);
   }
}

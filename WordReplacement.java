import java.io*;
import java.util.Scanner;

public class WordReplacement{
    public static void main (String[] args){
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a line of text: (blank line of text to stop");
        String string1 = kb.nextLine();
        if (kb.nextLine == " ")
            System.out.println("Enter substring to be replaced");
        String string2 = kb.nextLine();
        System.out.println("Enter the new substring:");
        String string3 = kb.nextLine();

            public static String replaceSubstring (String string1, String string2, String string3){
            int index = string1.indexOf(string2);
            while (index >= 0) {
                index = string1.indexOf(string2, index + 1);
            }
            if (string2.equals(index))
                string3.replace(string2);
                System.out.println(string1);
                else
                System.out.println("No matches found.");

        }
    }
}

import java.io.*;
import java.io.FileOutputStream;
import java.util.Scanner;
public class advice { 
    public static void main (String[] args)throws IOException{
	Scanner kb = new Scanner(System.in);
	System.out.print("Enter the filename: ");
	String filename = kb.nextLine();
	//Read file
	File file = new File(filename);
	Scanner inputFile = new Scanner(file);
	while (inputFile.hasNext())
	{
		String str=inputFile.nextLine();
		System.out.println(str);
	}
	//Add new text
	System.out.println("enter advice(hit return to quit):");
	String append = kb.nextLine();
	FileOutputStream fos = new FileOutputStream(new File(filename), true);
    fos.write(append.getBytes());
	fos.close();
	}
}

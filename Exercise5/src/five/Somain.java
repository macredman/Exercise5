package five;

/* Mackenzie Redman
 * 11/19/15
 *
 * Deitel book
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

import java.io.FileNotFoundException;

public class Somain {

	public static void main(String[] args) throws Exception {
		new Somain();
	}
	
	//constructor, calls methods
	Somain() throws Exception 
	{
		readFile("files.txt");
		
		if(ourValue != 0)
			ourValue = ourValue * 2;
		else
			ourValue = 1;
		
		writeFile("files.txt");
		System.out.println("My favorite number is now: " + ourValue);
		
		try
		{
		} catch(NumberFormatException e)
		{
			ourValue = 1;
			try
			{
				writeFile("file.txt");
			} catch(IOException ex)
			{
				System.out.println("Error: " + e);
			}
		} catch(Exception e)
		{
		System.out.println("Error: " + e);
		} 
	}
	
	//reads file
	void readFile(String fileName)
		throws IOException
	{
		String line;
		BufferedReader reader;
		File file;
		
		try
		{
			System.out.println("My favorite number is now: " + ourValue);
			reader = new BufferedReader(new FileReader(fileName));
			line = reader.readLine();
			ourValue = Integer.parseInt(line);
			
			//calls create class
			Create g = new Create();
			g.openFile();
			g.addRecords();
			g.closeFile();
			
			//calls Read class
			Read r = new Read();
			r.openFile();
			r.readFile();
			r.closeFile();
			
			System.out.println("My favorite number is now: " + ourValue);

		} catch(FileNotFoundException e)
		{
			file = new File(fileName);
			file.createNewFile();
			writeFile(fileName);
		}
	}
	
	//writes file
	void writeFile(String fileName)
		throws IOException
	{
		BufferedWriter writer;
		writer = new BufferedWriter(new FileWriter(fileName));
		writer.write(Long.toString(ourValue));
		writer.close();
	}
	
	long ourValue;
}

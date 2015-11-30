package five;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class classy {
	public static void main(String[] args) throws Throwable {
		File dir = new File(".");
 
		String source = dir.getCanonicalPath() + File.separator + "phile.txt";
		String dest = dir.getCanonicalPath() + File.separator + "files.txt";
 
		File fin = new File(source);
		FileInputStream fis = new FileInputStream(fin);
		BufferedReader in = new BufferedReader(new InputStreamReader(fis));
 
		FileWriter fstream = new FileWriter(dest, true);
		BufferedWriter out = new BufferedWriter(fstream);
 
		String aLine = null;
		while ((aLine = in.readLine()) != null) {
			//Process each line and add output to Dest.txt file
			out.write(aLine);
			out.newLine();
			
			new Somain();
		}
 
		// do not forget to close the buffer reader
		in.close();
 
		// close buffer writer
		out.close();
	}
}
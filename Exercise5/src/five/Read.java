package five;

import java.io.*;
import java.util.*;

public class Read {
	
	private Scanner x;
	
	//create new phile
	public void openFile(){
		try{
			x = new Scanner(new File("phile.txt"));
		}
		catch(Exception e){
			System.out.println("Could not find file");
		}
	}
	
	//reads file
	public void readFile(){
		while(x.hasNext()){
			
			String a = x.next();
			String b = x.next();
			String c = x.next();
			
			System.out.printf("%s %s %s\n", a, b, c);
		}
	}
	
	//closes file
	public void closeFile(){
		x.close();
	}

}

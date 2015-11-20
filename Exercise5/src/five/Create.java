package five;

import java.util.*;

public class Create {
	private Formatter x;
	
	public void openFile(){
		try{
			x = new Formatter("phile.txt");
		}
		catch(Exception e){
			System.out.println("You Errored");
		}
	}

	public void addRecords(){
		x.format("%s%s%s\n", "What ", "is ", "my ");
		x.format("%s%s%s\n", "favorite ", "number ", "now?!");
	}
	
	public void closeFile(){
		x.close();
	}
}

package five;

import java.util.*;

public class Create {
	
	private Formatter x;
	
	//opens file
	public void openFile(){
		try{
			x = new Formatter("phile.txt");
		}
		catch(Exception e){
			System.out.println("You Errored");
		}
	}

	//adds content to phile
	public void addRecords(){
		x.format("%s%s%s\n", "What ", "is ", "my ");
		x.format("%s%s%s\n", "favorite ", "number ", "now?!");
	}
	
	//closes phile
	public void closeFile(){
		x.close();
	}
}

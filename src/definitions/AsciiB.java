package definitions;

import java.util.ArrayList;

public class AsciiB extends Letters {
	// Constructor
	public AsciiB() {
		this.realLetter ="B";
		this.height = 3;
		this.width = 5;
	
	}

	 public ArrayList<String> generatePattern1() {
	        ArrayList<String> res = new ArrayList<>();
	        res.add("##  ");
	        res.add("# # ");
	        res.add("##  ");
	        res.add("# # ");
	        res.add("## ");
	        return res;
	    }

	    public ArrayList<String> generatePattern2() {
	        ArrayList<String> res = new ArrayList<>();
	        res.add("###    ");
	        res.add("#  #   ");
	        res.add("#   #  ");
	        res.add("#   #  ");
	        res.add("###   ");
	        res.add("#    ");
	        res.add("#  #   ");
	        res.add("#   #  ");
	        res.add("#   #  ");
	        res.add("#  #  ");
	        return res;
	    }
}

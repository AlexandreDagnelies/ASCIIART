package definitions;

import java.util.ArrayList;

public class AsciiS extends Letters {
	public AsciiS() {
		this.realLetter ="S";
	
	}
	
	 public ArrayList<String> generatePattern1() {
	        ArrayList<String> res = new ArrayList<>();
	        res.add(" ## ");
	        res.add("#   ");
	        res.add(" #  ");
	        res.add("  # ");
	        res.add("##  ");
	        return res;
	    }

	    public ArrayList<String> generatePattern2() {
	        ArrayList<String> res = new ArrayList<>();
	        res.add(" ##### ");
	        res.add("#      ");
	        res.add("#      ");
	        res.add(" #     ");
	        res.add("  #    ");
	        res.add("   #   ");
	        res.add("    #  ");
	        res.add("     # ");
	        res.add("     # ");
	        res.add(" ####  ");
	        return res;
	    }
}
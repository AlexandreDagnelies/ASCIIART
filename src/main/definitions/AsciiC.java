package definitions;

import java.util.ArrayList;

public class AsciiC extends Letters {
	public AsciiC() {
		this.realLetter ="C";
	
	}

	 public ArrayList<String> generatePattern1() {
	        ArrayList<String> res = new ArrayList<>();
	        res.add(" ## ");
	        res.add("#   ");
	        res.add("#   ");
	        res.add("#   ");
	        res.add(" ## ");
	        return res;
	    }

	    public ArrayList<String> generatePattern2() {
	        ArrayList<String> res = new ArrayList<>();
	        res.add("    ## ");
	        res.add("  #    ");
	        res.add("#      ");
	        res.add("#      ");
	        res.add("#      ");
	        res.add("#      ");
	        res.add("#      ");
	        res.add("#      ");
	        res.add(" #     ");
	        res.add("  ###  ");
	        return res;
	    }
}

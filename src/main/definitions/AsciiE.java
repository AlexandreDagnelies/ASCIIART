package definitions;

import java.util.ArrayList;

public class AsciiE extends Letters {
	
	public AsciiE() {
		this.realLetter ="E";
	
	}
	 public ArrayList<String> generatePattern1() {
	        ArrayList<String> res = new ArrayList<>();
	        res.add("### ");
	        res.add("#   ");
	        res.add("##  ");
	        res.add("#   ");
	        res.add("### ");
	        return res;
	    }

	    public ArrayList<String> generatePattern2() {
	        ArrayList<String> res = new ArrayList<>();
	        res.add("###### ");
	        res.add("#      ");
	        res.add("#      ");
	        res.add("#      ");
	        res.add("####   ");
	        res.add("####   ");
	        res.add("#      ");
	        res.add("#      ");
	        res.add("#      ");
	        res.add("###### ");
	        return res;
	    }
}

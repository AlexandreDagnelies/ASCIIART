package definitions;

import java.util.ArrayList;

public class AsciiW extends Letters {
	public AsciiW() {
		this.realLetter ="W";
	
	}
	
	 public ArrayList<String> generatePattern1() {
	        ArrayList<String> res = new ArrayList<>();
	        res.add("# # ");
	        res.add("# # ");
	        res.add("### ");
	        res.add("### ");
	        res.add("# # ");
	        return res;
	    }

	    public ArrayList<String> generatePattern2() {
	        ArrayList<String> res = new ArrayList<>();
	        res.add("#    # ");
	        res.add("#    # ");
	        res.add("#    # ");
	        res.add("#    # ");
	        res.add("#    # ");
	        res.add("#    # ");
	        res.add("# ## # ");
	        res.add("# ## # ");
	        res.add(" ####  ");
	        res.add("  ##   ");
	        return res;
	    }
}

package definitions;

import java.util.ArrayList;

public class AsciiX extends Letters {
	public AsciiX() {
		this.realLetter ="X";
	
	}
	
	public ArrayList<String> generatePattern1() {
        ArrayList<String> res = new ArrayList<>();
        res.add("# # ");
        res.add("# # ");
        res.add(" #  ");
        res.add("# # ");
        res.add("# # ");
        return res;
    }

    public ArrayList<String> generatePattern2() {
        ArrayList<String> res = new ArrayList<>();
        res.add("#    # ");
        res.add("#    # ");
        res.add("#    # ");
        res.add(" #  # ");
        res.add("  ##  ");
        res.add("  ##   ");
        res.add(" #  #  ");
        res.add("#    # ");
        res.add("#    # ");
        res.add("#    # ");
        return res;
    }
}

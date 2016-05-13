package main.definitions;

import java.util.ArrayList;

public class AsciiL extends Letters {
	public AsciiL() {
		this.realLetter ="L";
	
	}
	
	public ArrayList<String> generatePattern1() {
        ArrayList<String> res = new ArrayList<>();
        res.add("#   ");
        res.add("#   ");
        res.add("#   ");
        res.add("#   ");
        res.add("### ");
        return res;
    }

    public ArrayList<String> generatePattern2() {
        ArrayList<String> res = new ArrayList<>();
        res.add("#      ");
        res.add("#      ");
        res.add("#      ");
        res.add("#      ");
        res.add("#      ");
        res.add("#      ");
        res.add("#      ");
        res.add("#      ");
        res.add("#      ");
        res.add("###### ");
        return res;
    }
}

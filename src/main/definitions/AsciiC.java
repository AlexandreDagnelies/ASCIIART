package main.definitions;

import java.util.ArrayList;

public class AsciiC extends Letters {
	public AsciiC() {
		this.realLetter = "C";
		this.pattern1 = generatePattern1();
		this.pattern2 = generatePattern2();

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
		res.add("  #### ");
		res.add(" #     ");
		res.add("#      ");
		res.add("#      ");
		res.add("#      ");
		res.add("#      ");
		res.add("#      ");
		res.add("#      ");
		res.add(" #     ");
		res.add("  #### ");
		return res;
	}
}

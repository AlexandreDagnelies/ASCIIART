package main.definitions;

import java.util.ArrayList;

public class Concat extends AsciiBase {
	
	@Override
	public ArrayList<String> getPattern1() {
		String alphabet = "A";//BCDEFGHIJKLMNOPQRSTUVWXYZ?";
		ArrayList<String> pattern = new ArrayList<String>();
		ArrayList<String> ascii = new ArrayList<String>();
		ArrayList<String> lettreA = AsciiA.generatePattern1();
		ArrayList<String> lettreB = AsciiB.generatePattern1();
		ArrayList<String> lettreC = AsciiC.generatePattern1();
		ArrayList<String> lettreAll = new ArrayList<String>();
		
		//for(char letter : alphabet.toCharArray()) {
		/*
			try {
				AsciiBase asciiLettre = (AsciiBase) Class.forName("definitions.AsciiA").newInstance();
				System.out.println((asciiLettre.generatePattern1()));
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
		
		
		/*for (String string : lettreAll) {
			System.out.println(string);
		}*/

		return pattern;
	}
}

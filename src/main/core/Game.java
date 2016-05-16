package main.core;

import java.util.ArrayList;
import java.util.Random;

import main.definitions.AsciiA;
import main.definitions.AsciiPoint;
import main.definitions.Letters;

public class Game extends Algo {

	public static void main(String[] args) {

		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		String randomString = randomString(new Random(), alphabet, 10);
		System.out.println(randomString);
		boolean nbrRandom = randomSize();

		ArrayList<String> algo = algo(Letters.getWidth(), Letters.getHeight(), randomString, printPattern(nbrRandom));
		ArrayList<String> text = replaceCharacters(algo, "@?☺☻♥♦♣♠♫♀♂►◄☼");
		for (String string : text) {
			System.out.println(string);
		}
	}
	

	/**
	 * 
	 * @return boolean
	 */
	public static boolean randomSize() {
		ArrayList<String> ascii = new ArrayList<String>();
		if ((int) (Math.random() + 0.5) == 0) {
			Letters.setWidth(4);
			Letters.setHeight(5);
			return true;
		} else {
			Letters.setWidth(7);
			Letters.setHeight(10);
			return false;
		}

	}

	/**
	 * 
	 * @param nbrRandom
	 * @return ascii
	 */
	public static ArrayList<String> printPattern(boolean nbrRandom) {
		ArrayList<String> ascii = new ArrayList<String>();
		System.out.println("Height = " + Letters.getHeight());
		System.out.println("Width = " + Letters.getWidth());

		if (nbrRandom) {
			for (String string : Letters.printAsciiPattern1()) {
				ascii.add(string);
			}
		} else {
			for (String string : Letters.printAsciiPattern2()) {
				ascii.add(string);

			}
		}
		return ascii;
	}

	/**
	 * 
	 * @param nbr
	 * @param alphabet
	 * @param length
	 * @return text
	 */
	public static String randomString(Random nbr, String alphabet, int length) {
		char[] text = new char[length];
		for (int i = 0; i < length; i++) {
			text[i] = alphabet.charAt(nbr.nextInt(alphabet.length()));
		}
		return new String(text);
	}
	/**
	 * replace characters in a ArrayList<String> by random another
	 * @param listReplace
	 * @param Characters
	 * @return listReplace;
	 */
	public static ArrayList<String> replaceCharacters(ArrayList<String> listReplace, String Characters ) {
		
	    final int N = Characters.length();
		for (int b = 0; b < listReplace.size(); b++) {
			Random r = new Random();
		    String randomCharacters = Character.toString(Characters.charAt(r.nextInt(N)));
			String replaceLetters = listReplace.get(b);
			replaceLetters = replaceLetters.replaceAll("#", randomCharacters);
			listReplace.set(b, replaceLetters);
		}
		return listReplace;
	}

}

package main.definitions;

import java.util.ArrayList;
import java.util.Arrays;

public class Letters {

	// Attributes
	protected String realLetter;
	protected static int height;
	protected static int width;
	protected static ArrayList<String> pattern1 = new ArrayList<String>();
	protected static ArrayList<String> pattern2 = new ArrayList<String>();
	protected static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ?";

	// Getters and setters

	/**
	 * 
	 * @return realLetter String
	 */
	public String getRealLetter() {
		return realLetter;
	}

	/**
	 * 
	 * @param realLetter
	 */
	public void setRealLetter(String realLetter) {
		this.realLetter = realLetter;
	}

	/**
	 * 
	 * @return pattern1
	 */
	public ArrayList<String> getPattern1() {
		return pattern1;
	}

	/**
	 * 
	 * @param pattern1
	 */
	public void setPattern1(ArrayList<String> pattern1) {
		this.pattern1 = pattern1;
	}

	/**
	 * 
	 * @return pattern2
	 */
	public ArrayList<String> getPattern2() {
		return pattern2;
	}

	/**
	 * 
	 * @param pattern2
	 */
	public void setPattern2(ArrayList<String> pattern2) {
		this.pattern2 = pattern2;
	}

	/**
	 * 
	 * @return height
	 */
	public static int getHeight() {
		return height;
	}

	/**
	 * 
	 * @param height
	 */
	public static void setHeight(int height) {
		Letters.height = height;
	}

	/**
	 * 
	 * @return width
	 */
	public static int getWidth() {
		return width;
	}

	/**
	 * 
	 * @param width
	 */
	public static void setWidth(int width) {
		Letters.width = width;
	}

	/**
	 * 
	 * @return ArrayList<String> pattern 
	 */
	public static ArrayList<String> printAsciiPattern1() {
		Letters letter = null;
		String line = "";
		//La taille d'une lettre est égal à 5;
		for (int i = 0; i < height; i++) {
			for (char c : alphabet.toCharArray()) {

				try {
					if (c == '?') {
						letter = new AsciiPoint();
					} else {
						letter = (Letters) Class.forName("main.definitions.Ascii" + c).newInstance();
					}
					// Pour chaque lettre on prend la string à l'index i;
					line += letter.getPattern1().get(i);

				} catch (InstantiationException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
			}
			line += ",";
		}
		ArrayList<String> pattern = new ArrayList<String>(Arrays.asList(line.split(",")));
		return pattern;
	}

	/**
	 * 
	 * @return ArrayList<String> pattern 
	 */
	 
	public static ArrayList<String> printAsciiPattern2() {
		Letters letter = null;
		String line = "";
		//La taille d'une lettre est égal à 10;
		for (int i = 0; i < height; i++) {
			for (char c : alphabet.toCharArray()) {

				try {
					if (c == '?') {
						letter = new AsciiPoint();
					} else {
						letter = (Letters) Class.forName("main.definitions.Ascii" + c).newInstance();
					}
					// Pour chaque lettre on prend la string à l'index i;
					line += letter.getPattern2().get(i);

				} catch (InstantiationException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
			}
			line += ",";
		}
		ArrayList<String> pattern = new ArrayList<String>(Arrays.asList(line.split(",")));
		return pattern;
	}

}

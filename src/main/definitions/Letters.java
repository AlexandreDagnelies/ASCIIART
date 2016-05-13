package main.definitions;

import java.util.ArrayList;

public class Letters {
	
	//Attributes
	protected String realLetter;
	protected int height;
	protected int width;
	protected ArrayList<String[]> pattern1 = new ArrayList<String[]>();
	protected ArrayList<String[]> pattern2 = new ArrayList<String[]>();
	
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
	public ArrayList<String[]> getPattern1() {
		return pattern1;
	}
	
	/**
	 * 
	 * @param pattern1
	 */
	public void setPattern1(ArrayList<String[]> pattern1) {
		this.pattern1 = pattern1;
	}
	
	/**
	 * 
	 * @return pattern2
	 */
	public ArrayList<String[]> getPattern2() {
		return pattern2;
	}
	
	/**
	 * 
	 * @param pattern2
	 */
	public void setPattern2(ArrayList<String[]> pattern2) {
		this.pattern2 = pattern2;
	}
	
	

	/**
	 * 
	 * @return height
	 */
	public int getHeight() {
		return height;
	}
	
	/**
	 * 
	 * @param height
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	/**
	 * 
	 * @return width
	 */
	public int getWidth() {
		return width;
	}
	
	/**
	 * 
	 * @param width
	 */
	public void setWidth(int width) {
		this.width = width;
	}
	
	/**
	 * 
	 * @param pattern
	 * @return 
	 */
	public ArrayList<String> printAsciiPatern1(ArrayList<String> pattern) {
		for (String string : pattern) {
			//System.out.println(string);
			
		}
		return pattern;
	}

	/**
	 * 
	 * @param pattern
	 */
	public ArrayList<String> printAsciiPatern2(ArrayList<String> pattern) {
		for (String string : pattern) {
			//System.out.println(string);
		}
		return pattern;
	}
	 
}


	
	

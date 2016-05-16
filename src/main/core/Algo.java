package main.core;

import java.util.ArrayList;

public class Algo {
	/**
	 * 
	 * @param width
	 * @param height
	 * @param text
	 * @param ascii
	 * @return response 
	 */
	public static ArrayList<String> algo(int width, int height, String text, ArrayList<String> ascii  ) {
		
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ?";
		
		
		
		// Find the necessary index to the letter
		
				ArrayList<Integer> indexes = new ArrayList<Integer>();
				//text to uppercase and conversion table
				
				for(char c : text.toUpperCase().toCharArray()) {
					
					if(c < 'A' || c > 'Z'){
						//For  "?"
						indexes.add(26);
					}
					else {
						for(char letter : alphabet.toCharArray()) {
							if(c == letter) {
								indexes.add(alphabet.indexOf(letter));
							}
						}
					}
				}
				
				ArrayList<String> response = new ArrayList<String>();
				String str = ""	;
				//for each line
				for(int j = 0; j < height; j++) {
					str = ""	;
						//For each letter in indexes
					for(int k = 0; k < indexes.size(); k++) {				
						//At each line (j), extracts the character at the right indexes and go back in str
						str += (ascii.get(j).substring(indexes.get(k)*width, indexes.get(k)*width + width));
					}
					//str added in ArrayList<String> response
					response.add(str);
					
				}
				
				return response;
				
			
	}
}

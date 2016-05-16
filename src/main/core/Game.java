package main.core;

import java.util.ArrayList;
import java.util.Random;

import main.definitions.AsciiA;
import main.definitions.AsciiPoint;
import main.definitions.Letters;


public class Game extends Algo {

	public static void main(String[] args) {
		
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		
		/*
		ascii.add(" #  ##   ## ##  ### ###  ## # # ###  ## # # #   # # ###  #  ##   #  ##   ## ### # # # # # # # # # # ### ###  ");
		ascii.add("# # # # #   # # #   #   #   # #  #    # # # #   ### # # # # # # # # # # #    #  # # # # # # # # # #   #   #  ");
		ascii.add("### ##  #   # # ##  ##  # # ###  #    # ##  #   ### # # # # ##  # # ##   #   #  # # # # ###  #   #   #   ##  ");
		ascii.add("# # # # #   # # #   #   # # # #  #  # # # # #   # # # # # # #    ## # #   #  #  # # # # ### # #  #  #        ");
		ascii.add("# # ##   ## ##  ### #    ## # # ###  #  # # ### # # # #  #  #     # # # ##   #  ###  #  # # # #  #  ###  #  ");
		*/
		//ascii.add(Letters.printAsciiPattern1())
		//
		/*
		//On ajoute chaque string Letters.printAsciiPattern1(); dans ascii.
		for (String string : Letters.printAsciiPattern1() ){
			//ascii.add(string);
			//System.out.println(string);
			
		}*/
		String randomString = randomString(new Random(), "alphabet", 10);
        System.out.println(randomString);
		boolean nbrRandom = randomSize();
		
		ArrayList<String> algo = algo(7,10, "MANHATTAN", printPattern(nbrRandom));
		
        
		
		 for (String string : algo ){
			System.out.println(string);
			 
			
		}
	}
	
	
	public static boolean randomSize() {
		ArrayList<String> ascii = new ArrayList<String>();
        if ((int)(Math.random() + 0.5) == 0) {
            Letters.setWidth(4);
            Letters.setHeight(5);
            return true;
        } else {
        	Letters.setWidth(7);
        	Letters.setHeight(10);
        	return false;
        }
        
    }
	public static  ArrayList<String> printPattern(boolean nbrRandom) {
		ArrayList<String> ascii = new ArrayList<String>();
        System.out.println("Height = " + Letters.getHeight());
        System.out.println("Width = " + Letters.getWidth());
        
        if (nbrRandom) {
            for (String string : Letters.printAsciiPattern1() ){
    			ascii.add(string);
    		}
        } else {
        	for (String string : Letters.printAsciiPattern2() ){
    			ascii.add(string);
    			
    		}
        }
        return ascii;
    }
	
	/**
	 * Generate a random string
	 * 
	 * @return String
	 */
	public static String randomString(Random rng, String characters, int length) {
		char[] text = new char[length];
	    for (int i = 0; i < length; i++) {
	        text[i] = characters.charAt(rng.nextInt(characters.length()));
	    }
	    return new String(text);
	}
	
}

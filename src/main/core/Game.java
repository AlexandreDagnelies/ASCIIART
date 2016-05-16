package main.core;

import java.util.ArrayList;
import java.util.Random;

import main.definitions.AsciiA;
import main.definitions.AsciiPoint;
import main.definitions.Letters;


public class Game extends Algo {

	public static void main(String[] args) {
		
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ?";
		
		
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
		int height = Letters.getHeight();
		boolean nbrRandom = randomSize();
		
		ArrayList<String> coucou = algo(Letters.getWidth(),Letters.getHeight(), "@", randomPattern(nbrRandom));
		 System.out.println(Letters.getHeight() );
		
		 for (String string : coucou ){
			System.out.println(string);
			 
			
		}
		//System.out.println(Letters.printAsciiPattern1());
		//Letters.printAsciiPattern1();
		
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
	public static  ArrayList<String> randomPattern(boolean random) {
		ArrayList<String> ascii = new ArrayList<String>();
        if (random) {
            for (String string : Letters.printAsciiPattern1() ){
    			ascii.add(string);
    		}
            System.out.println("vrai");
        } else {
        	for (String string : Letters.printAsciiPattern2() ){
    			ascii.add(string);
    			
    		}
        	System.out.println("faux");
        }
        return ascii;
    }
	
}

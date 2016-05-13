package main.core;

import java.util.ArrayList;
import java.util.Random;


public class Game extends Algo {

	public static void main(String[] args) {
		
		ArrayList<String> ascii = new ArrayList<String>();
		
		ascii.add(" #  ##   ## ##  ### ###  ## # # ###  ## # # #   # # ###  #  ##   #  ##   ## ### # # # # # # # # # # ### ###  ");
		ascii.add("# # # # #   # # #   #   #   # #  #    # # # #   ### # # # # # # # # # # #    #  # # # # # # # # # #   #   #  ");
		ascii.add("### ##  #   # # ##  ##  # # ###  #    # ##  #   ### # # # # ##  # # ##   #   #  # # # # ###  #   #   #   ##  ");
		ascii.add("# # # # #   # # #   #   # # # #  #  # # # # #   # # # # # # #    ## # #   #  #  # # # # ### # #  #  #        ");
		ascii.add("# # ##   ## ##  ### #    ## # # ###  #  # # ### # # # #  #  #     # # # ##   #  ###  #  # # # #  #  ###  #  ");
		
		ArrayList<String> coucou = algo(4, 5, "Jessy", ascii);
		
		
		for (String string : coucou){
			System.out.println(string);
		}
		Data();
	}
	
	public static ArrayList<String> Data() {
		ArrayList<String> list = new ArrayList<String>();
		
		Random random = new Random();
	    Boolean randBool = random.nextBoolean();
	   /*
	    Concat concat = new Concat();
	    
	    ArrayList<String> test = concat.getPattern1();
	    if (randBool == true){
	    	//Call pattern1
	    	
	    	
	    }else{
	    	//Call pattern2
	    }
		*/
		return list;
	}
	 
	

}

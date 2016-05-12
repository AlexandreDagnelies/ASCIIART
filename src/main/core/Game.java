package main.core;

import java.util.ArrayList;

public class Game {
	
	public static void main(String[] args) {
		
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ?";
		int width = 4;
		int height = 5;
		String text= "couco coucou";
		ArrayList<String> ascii = new ArrayList<String>();
		
		ascii.add(" #  ##   ## ##  ### ###  ## # # ###  ## # # #   # # ###  #  ##   #  ##   ## ### # # # # # # # # # # ### ###  ");
		ascii.add("# # # # #   # # #   #   #   # #  #    # # # #   ### # # # # # # # # # # #    #  # # # # # # # # # #   #   #  ");
		ascii.add("### ##  #   # # ##  ##  # # ###  #    # ##  #   ### # # # # ##  # # ##   #   #  # # # # ###  #   #   #   ##  ");
		ascii.add("# # # # #   # # #   #   # # # #  #  # # # # #   # # # # # # #    ## # #   #  #  # # # # ### # #  #  #        ");
		ascii.add("# # ##   ## ##  ### #    ## # # ###  #  # # ### # # # #  #  #     # # # ##   #  ###  #  # # # #  #  ###  #  ");
		
			
		
		//Trouve l'index nécessaire à letter
		
		ArrayList<Integer> indexes = new ArrayList<Integer>();
		//On met text en majuscule, et on le convertit en tableau
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
		
		//pour chaque ligne
		for(int j = 0; j < height; j++) {
			//Pour chaque lettre dans indexes
			for(int k = 0; k < indexes.size(); k++) {				
				//A Chaque ligne (j), extrait les cararacère au bon index et les retournes
				System.out.print(ascii.get(j).substring(indexes.get(k)*width, indexes.get(k)*width + width));
			}
			System.out.println();
		}
		
	}

}

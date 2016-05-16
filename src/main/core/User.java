package main.core;

import java.util.ArrayList;
import java.util.Scanner;

import main.definitions.Letters;

public class User extends Game {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Text: ");
		String text = in.nextLine().toUpperCase();
		System.out.print("Saisissez une hauteur: ");
		int height = in.nextInt();
		System.out.print("Saisissez une largeur: ");
		int width = in.nextInt();

		boolean val = checkParameter(height, width, text);
		ArrayList<String> algo = new ArrayList<>();
		if (val) {
			if (width == 4 || height == 5) {
				Letters.setWidth(4);
				Letters.setHeight(5);
				 algo = algo(Letters.getWidth(), Letters.getHeight(), text, printPattern(true));
			} else if (width == 7 || height == 10) {
				Letters.setWidth(7);
				Letters.setHeight(10);
				 algo = algo(Letters.getWidth(), Letters.getHeight(), text, printPattern(false));
			} else {
				System.out.println("il faut saisir 5 et 4 ou 10 et 7 ");
			}
			for (String string : algo) {
				System.out.println(string);
			}

		} else {
			System.out.println("mauvais parametre");
		}

	}

	public static boolean checkParameter(int height, int width, String txt) {
		if (0 > height || height > 30 || 0 > width || width > 30 || 0 > txt.length() || txt.length() > 200) {
			return false;
		} else {
			return true;
		}
	}
}

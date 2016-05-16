package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import com.github.javafaker.Faker;

import main.core.Game;
import main.definitions.Letters;

public class TestCodingame {
	@Before
	public void testPrintPattern() {
		Letters.setWidth(4);
		Letters.setHeight(5);
	}

	/**
	 * Tests with letter: E
	 */
	@Test
	public void testLetterE() {
		String text = "E";
		ArrayList<String> ascii = new ArrayList<>();
		ascii.add("### ");
		ascii.add("#   ");
		ascii.add("##  ");
		ascii.add("#   ");
		ascii.add("### ");
		assertEquals(ascii, Game.algo(Letters.getWidth(), Letters.getHeight(), text, Letters.printAsciiPattern1()));
	}

	/**
	 * Tests "MANHATTAN" all uppercase.
	 */
	@Test
	public void testManhattanUppercase() {
		ArrayList<String> ascii = new ArrayList<>();
		String text = "MANHATTAN";
		ascii.add("# #  #  ### # #  #  ### ###  #  ### ");
		ascii.add("### # # # # # # # #  #   #  # # # # ");
		ascii.add("### ### # # ### ###  #   #  ### # # ");
		ascii.add("# # # # # # # # # #  #   #  # # # # ");
		ascii.add("# # # # # # # # # #  #   #  # # # # ");
		assertEquals(ascii, Game.algo(Letters.getWidth(), Letters.getHeight(), text, Letters.printAsciiPattern1()));
	}
	
	/**
     * Tests "ManhAtTan" uppercase and lowercase mixed
     */
    @Test
    public void testManhattanUpperLower() {
    	ArrayList<String> ascii = new ArrayList<>();
		String text = "ManhAtTan";
		ascii.add("# #  #  ### # #  #  ### ###  #  ### ");
		ascii.add("### # # # # # # # #  #   #  # # # # ");
		ascii.add("### ### # # ### ###  #   #  ### # # ");
		ascii.add("# # # # # # # # # #  #   #  # # # # ");
		ascii.add("# # # # # # # # # #  #   #  # # # # ");
		assertEquals(ascii, Game.algo(Letters.getWidth(), Letters.getHeight(), text, Letters.printAsciiPattern1()));
    }
    /**
     * Tests "M@NH@TT@N" with special characters that should be replaced by "?"
     */
    @Test
    public void testManhattanSpecialChar() {
    	ArrayList<String> ascii = new ArrayList<>();
		String text = "M@NH@TT@N";
		ascii.add("# # ### ### # # ### ### ### ### ### ");
        ascii.add("###   # # # # #   #  #   #    # # # ");
        ascii.add("###  ## # # ###  ##  #   #   ## # # ");
        ascii.add("# #     # # # #      #   #      # # ");
        ascii.add("# #   # # # # #   #  #   #    # # # ");
		assertEquals(ascii, Game.algo(Letters.getWidth(), Letters.getHeight(), text, Letters.printAsciiPattern1()));
    }
    
    /**
     * Tests "MANHATTAN" with the second pattern (7 by 10)
     */
    @Test
    public void testManhattanPattern2() {
    	 String text = "MANHATTAN";
    	 Letters.setWidth(7);
    	 Letters.setHeight(10);
    	 ArrayList<String> ascii = new ArrayList<>();
         ascii.add("#    #   ##   ###### #    #   ##   ###### ######   ##   ###### ");
         ascii.add("##  ## #    # #    # #    # #    # ###### ###### #    # #    # ");
         ascii.add("# ## # #    # #    # #    # #    #   ##     ##   #    # #    # ");
         ascii.add("#    # #    # #    # #    # #    #   ##     ##   #    # #    # ");
         ascii.add("#    # ###### #    # ###### ######   ##     ##   ###### #    # ");
         ascii.add("#    # #    # #    # #    # #    #   ##     ##   #    # #    # ");
         ascii.add("#    # #    # #    # #    # #    #   ##     ##   #    # #    # ");
         ascii.add("#    # #    # #    # #    # #    #   ##     ##   #    # #    # ");
         ascii.add("#    # #    # #    # #    # #    #   ##     ##   #    # #    # ");
         ascii.add("#    # #    # #    # #    # #    #   ##     ##   #    # #    # ");
        
		assertEquals(ascii, Game.algo(Letters.getWidth(), Letters.getHeight(), text, Letters.printAsciiPattern2()));
    }
    

}

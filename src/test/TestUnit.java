package test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Random;

import org.junit.Test;

import main.core.Algo;
import main.core.Game;
import main.definitions.Letters;
public class TestUnit {

	/**
	 * Test whether this is Letters.printAsciiPattern1() that is returned if the width is 4 and the height is 5
	 */
	@Test
	public void printAsciiPattern1Test() {
		Letters.setWidth(4);
        Letters.setHeight(5);
        ArrayList<String> actual = new ArrayList<String>();
        ArrayList<String> letters =  Letters.printAsciiPattern1();
        for (String string : letters ){
			actual.add(string);
		}
		
        ArrayList<String> expected = new ArrayList<String>();
        expected.add(" #  ##   ## ##  ### ###  ## # # ###  ## # # #   # # ###  #  ##   #  ##   ## ### # # # # # # # # # # ### ###  ");
        expected.add("# # # # #   # # #   #   #   # #  #    # # # #   ### # # # # # # # # # # #    #  # # # # # # # # # #   #   # ");
        expected.add("### ##  #   # # ##  ##  # # ###  #    # ##  #   ### # # # # ##  # # ##   #   #  # # # # ###  #   #   #   ## ");
        expected.add("# # # # #   # # #   #   # # # #  #  # # # # #   # # # # # # #    ## # #   #  #  # # # # ### # #  #  #       ");
        expected.add("# # ##   ## ##  ### #    ## # # ###  #  # # ### # # # #  #  #     # # # ##   #  ###  #  # # # #  #  ###   # ");
        
		
		assertEquals(expected, actual);
		}
	
	/**
	 * Test whether this is Letters.printAsciiPattern2 () that is returned if the width is 7 and the height is 10
	 */
	@Test
	public void printAsciiPattern2Test() {
		Letters.setWidth(7);
        Letters.setHeight(10);
        ArrayList<String> actual = new ArrayList<String>();
        ArrayList<String> letters =  Letters.printAsciiPattern2();
        for (String string : letters ){
			actual.add(string);
		}
		
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("  ##   ###      #### ####   ###### ######   ###  #    # ######   #### #    # #      #    # ######   ##   ###      ##   ###     ##### ###### #    # #    # #    # #    # #    # ###### ###### ");
        expected.add("#    # #  #    #     #   #  #      #       #     #    #   ##       #  #    # #      ##  ## #    #  #  #  #  #    #  #  #  #   #      ###### #    # #    # #    # #    # #    #      #      # ");
        expected.add("#    # #   #  #      #    # #      #      #      #    #   ##       #  #    # #      # ## # #    # #    # #   #  #    # #   #  #        ##   #    # #    # #    # #    # #    #      #      # ");
        expected.add("#    # #   #  #      #    # #      #      #      #    #   ##       #  #  #   #      #    # #    # #    # #   #  #    # #    #  #       ##   #    # #    # #    #  #  #  #    #     #       # ");
        expected.add("###### ###    #      #    # ####   ####   #  ### ######   ##       #  ###    #      #    # #    # #    # #  #   #    # #   #    #      ##   #    # #    # #    #   ##   #    #    #        # ");
        expected.add("#    # #      #      #    # ####   #      #    # #    #   ##       #  ###    #      #    # #    # #    # ###     #  ## ####      #     ##   #    # #    # #    #   ##    ####    #      #### ");
        expected.add("#    # #  #   #      #    # #      #      #    # #    #   ##   #   #  #  #   #      #    # #    # #    # #        ## # #   #      #    ##   #    # #    # # ## #  #  #    ##    #       #    ");
        expected.add("#    # #   #  #      #    # #      #      #    # #    #   ##   #   #  #    # #      #    # #    # #    # #           # #    #      #   ##   #    # #    # # ## # #    #   ##   #        #    ");
        expected.add("#    # #   #   #     #   #  #      #       #   # #    #   ##    #  #  #    # #      #    # #    #  #  #  #           # #    #      #   ##   #    #  #  #   ####  #    #   ##   #             ");
        expected.add("#    # ####     #### ####   ###### #        #### #    # ######   ##   #    # ###### #    # #    #   ##   #           # #    #  ####    ##   ######   ##     ##   #    #   ##   ######   #    ");
        
		
		assertEquals(expected, actual);
		}
	
		/**
		 * test if "?" is sent if we enter a special character
		 */
		@Test
		public void testSpecialChar() {
			Letters.setWidth(4);
	        Letters.setHeight(5);
	        String text = "@";
		    ArrayList<String> ascii = new ArrayList<>();
		    ascii.add("### ");
		    ascii.add("  # ");
		    ascii.add(" ## ");
		    ascii.add("    ");
		    ascii.add("  # ");
		    assertEquals(ascii, Game.algo(Letters.getWidth(),Letters.getHeight(), text, Letters.printAsciiPattern1()));
		}
	
	
	
}

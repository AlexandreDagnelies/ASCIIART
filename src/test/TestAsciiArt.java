package test;

import org.junit.Test;

public class TestAsciiArt {
	
	@Test
	public boolean testWidth (int i) {
		
		if (0< i && i<30) {
			return true;
		} else {
		return false; 
		}
	}
	
	@Test
	public boolean testHeight (int i) {
		
		if (0< i && i<30) {
			return true;
		} else {
		return false; 
		}
	}
	
	@Test
	public boolean testLetter (int i) {
		
		if (0< i && i<200) {
			return true;
		} else {
		return false; 
		}

	}

}

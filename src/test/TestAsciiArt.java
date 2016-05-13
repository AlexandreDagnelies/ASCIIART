package test;

import org.junit.Test;

import com.github.javafaker.Faker;

public class TestAsciiArt {
	
	@Test
	public boolean testWidth (int i) {
		Faker faker = new Faker();
		String toto = faker.firstName();
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

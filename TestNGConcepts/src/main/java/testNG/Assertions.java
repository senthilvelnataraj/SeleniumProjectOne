package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {

	//** Assertions are Mainly used for Developers for unit testing
	@Test
	public void checkEquals() {

		String name = "senthils";
		boolean value=true;
//		if (name.equals("Senthil")) {
//
//			System.out.println("Test is passed");
//		} else {
//			System.out.println("Test if failed");
//		}

		Assert.assertEquals(name, "senthil");
		Assert.assertFalse(value, "Perfect");
	}

}

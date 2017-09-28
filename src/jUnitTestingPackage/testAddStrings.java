package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitFunction junit = new jUnitFunction();
		String result = junit.addString("blue", "whale");
		assertEquals("bluewhale",result);
	}
	}
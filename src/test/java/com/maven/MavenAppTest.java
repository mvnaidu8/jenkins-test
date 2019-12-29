package com.maven;

import static org.junit.Assert.*;

import org.junit.Test;

public class MavenAppTest {

	@Test
	public void testSquare() {
		MavenApp test = new MavenApp();
		int output = test.square(5);
		assertEquals(25, output);
	}
	@Test
	   public void test() {
	      assertTrue(true);
	   }

}

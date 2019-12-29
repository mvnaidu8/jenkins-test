package com.maven;

import static org.junit.Assert.*;

import org.junit.Test;

public class MavenAppTest {

	@Test
	public void testSquare() {
		System.out.println("Inside testSquare");
		MavenApp test = new MavenApp();
		int output = test.square(5);
		assertEquals(24, output);
	}
	@Test
	   public void test() {
		System.out.println("Inside test");
	      assertTrue(true);
	   }

}

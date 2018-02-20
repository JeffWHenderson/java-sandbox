package com.sandbox.jeff;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnitTest {

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
	
	@Test
	public void add_for100and200_Sum() {
		SandBox practice = new SandBox();
		int result = practice.add(100, 200);
		
		assertEquals(300, result);
	}

}

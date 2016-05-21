package com.fuckbh.sample2048.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class BlockTest {

	@Test
	public void testGetAndSetValue() {
		
		Block block = new Block();
		
		assertEquals(0, block.getValue());
	}
}

package com.fuckbh.sample2048.model;
import static org.junit.Assert.*;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

public class PointTest {

	@Test
	public void testGetAndSetXY() {
		
		int x = 1;
		int y = 2;
		
		Point point = new Point(x, y);
		assertEquals(x, point.getX());
		assertEquals(y, point.getY());
		
		int modifiedX = 2;
		int modifiedY = 4;
		
		point.setX(modifiedX);
		point.setY(modifiedY);
		
		assertEquals(modifiedX, point.getX());
		assertEquals(modifiedY, point.getY());

		System.out.println(StringUtils.isNumeric("1234"));
	}
}

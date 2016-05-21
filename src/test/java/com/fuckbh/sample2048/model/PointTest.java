package com.fuckbh.sample2048.model;

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
	}
}

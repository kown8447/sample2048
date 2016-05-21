package com.fuckbh.sample2048.model;

public class Block {
	
	private int value;
	private Point point;
	
	public Block(){}
	public Block(int value, Point point) {
		this.value = value;
		this.point = point;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public Point getPoint() {
		return point;
	}
	public void setPoint(Point point) {
		this.point = point;
	}
}

package com.javaex.api.objectclass.ex01;

public class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Point(" + x + ", " + y + ")";
		//포맷(출력형식을 변경해준다.)
	}
}

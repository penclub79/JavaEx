package com.javaex.oop.poing.v2;

public class Point {
	//v2
	//필드
	private int x;
	private int y;
	//생성자
	public Point() {
		
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void draw() {
		System.out.printf("점 [x = %d, y = %d]을 그렸습니다.\n"
				, x, y);
	}
	
}

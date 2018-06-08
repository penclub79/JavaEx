package com.javaex.oop.shape.v2;

public class Point implements Drawable{
	
	protected int x;
	protected int y;
	
	
	//생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	@Override
	public void draw() {
		System.out.printf("점 [x=%d, y=%d]을 그렸습니다.",x ,y);
		
	}

}

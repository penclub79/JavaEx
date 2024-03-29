package com.javaex.oop.shape.v1;

public class Rectangle extends Shape{
//	필드추가
	protected int width;
	protected int height;
	
//	생성자
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	@Override
	public double area() {
		return width * height;
	}
	@Override
	public void draw() {
		System.out.printf("사각형[x=%d, y=%d, wi=%d, he=%d, area=%f]을 그렸어요\n",
				x, y, width, height, area()); //자기 생성자
	}
}

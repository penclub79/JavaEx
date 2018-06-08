package com.javaex.oop.shape.v2;

public class Rectangle extends Shape implements Drawable{
//	필드추가
	protected int width;
	protected int height;
	
//	생성자
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	@Override		//추상클래스부터 오버라이드
	public double area() {
		return width * height;
	}
	
	public void draw() {
		System.out.printf("사각형[x=%d, y=%d, wi=%d, he=%d, area=%f]을 그렸어요\n",
				x, y, width, height, area()); //자기 생성자
	}
}

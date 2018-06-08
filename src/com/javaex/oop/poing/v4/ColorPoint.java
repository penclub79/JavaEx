package com.javaex.oop.poing.v4;

public class ColorPoint extends Point {
	private String color;
	
	
	//	생성자
	public ColorPoint() {
		super();
	}
	
	//생성자2
	public ColorPoint(String color) {
		super();
		this.color = color;
	}
	
	//생성자3
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	
	//getters / setters
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	@Override		
	//자바 컴파일러한테 오버라이드 메서드라는 것을 알려준다.
	public void draw() {
		System.out.printf("색깔점[color=%s, x=%d, y=%d]을 그렸습니다.\n",
				color, x, y);
//		getX(),getY()는 부모클래스에서 private접근 제한자 때문에 썻다
//		protected 접근제한자를 사용하면 부모클래스의 x, y를 쓸 수있다.
		
	}
	

}

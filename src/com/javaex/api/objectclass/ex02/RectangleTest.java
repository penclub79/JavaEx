package com.javaex.api.objectclass.ex02;

public class RectangleTest {
	public static void main(String[] args) {
		
		Rectangle a = new Rectangle(6,4);
		Rectangle b = new Rectangle(2,12);
		Rectangle c = new Rectangle(3,3);
		Rectangle d = c;
		
		//a와 b의 면적비교
		System.out.println(a.equals(b));
		//a와 c의 면적비교
		System.out.println(a.equals(c));
		System.out.println(a.equals(d));
		System.out.println(b.equals(a));

	}
}

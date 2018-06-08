package com.javaex.oop.poing.v4;

public class PointApp {

	public static void main(String[] args) {
//		Point x = new Point();
//		x.setX(5);
//		x.setY(5);
		Point x = new Point(5,5);
		x.draw();
		
//		Point y = new Point();
//		y.setX(10);
//		y.setY(23);
		Point y = new Point(10, 23);
		y.draw();
		
		y.darw(true);
		y.darw(false);
		
		ColorPoint cp = new ColorPoint("red");
		cp.draw();
		
		ColorPoint cp2 = new ColorPoint(10, 10, "blue");
		cp2.draw();
		System.out.println();
		
	}

}

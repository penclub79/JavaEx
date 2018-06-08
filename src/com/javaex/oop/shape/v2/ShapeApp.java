package com.javaex.oop.shape.v2;

public class ShapeApp {

	public static void main(String[] args) {
//		Shape s = new Shape(); 안된다.
//		추상에서의 설계도는 인스턴스가 안된다.
		
		Rectangle r = new Rectangle(10, 20, 100, 50);
		r.draw();
		
		Circle c = new Circle(10, 10, 30);
		c.draw();
		
		Point p = new Point(100, 100);
		p.draw();
		
		Drawable obj = p;
		
//		if(obj instanceof Drawable)	{
//			obj.draw();
//		}
//		
//		obj = c;
//		
//		if(obj instanceof Drawable)	{
//			obj.draw();
//		}
//		
//		printObject(obj);
//		
//	
//		}
		
		
	}
	public static void printObject(Drawable obj) {
		obj.draw();
//		인터페이스 다형성코드 
	}
	

}

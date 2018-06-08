package com.javaex.api.objectclass.ex03;

public class Clonetest {

	public static void main(String[] args) {
		Point p = new Point(10, 20);
		System.out.println("p = "+ p);
		
//		Point p2 = p;
		Point p2 = p.getClone();
		System.out.println("p2 = "+p2);
		System.out.println("-------------------");
		p2.setX(30);
		p2.setY(100);
		//값을 변경해도 
		
		System.out.println("p2 = "+p2);
		System.out.println("p = "+p);

	}

}

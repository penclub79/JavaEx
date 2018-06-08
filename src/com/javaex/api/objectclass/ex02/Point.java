package com.javaex.api.objectclass.ex02;

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

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Point) {	//만약 오브젝트객체가 포인트꺼다
			Point other = (Point)obj;
			return x == other.x && y == other.y;
		}
		return super.equals(obj);
//		return false; 도 가능
	}
	
	
}

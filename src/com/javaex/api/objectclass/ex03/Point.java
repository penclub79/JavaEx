package com.javaex.api.objectclass.ex03;

public class Point implements Cloneable{	//클론 메소드 쓸수있다.
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
	
	public Point getClone() {
		Point clone = null;
		
		try {
			clone = (Point)clone();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		return clone;
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
	
	
}

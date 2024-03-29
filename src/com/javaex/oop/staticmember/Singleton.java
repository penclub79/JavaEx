package com.javaex.oop.staticmember;

public class Singleton {
	private static Singleton instance = new Singleton();
	
	private Singleton() {
		//new 호출 불가 대신 public 생성자를 만들면 new를 호출
	}
	
	public static Singleton getInstance() {
		return instance;
	}
}

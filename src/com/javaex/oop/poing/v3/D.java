package com.javaex.oop.poing.v3;

public class D {
	
	public static int getNum(int ... su) {
		int num = 0;
		for(int num2 : su) {
			num+=num2;
		}
		return num;
		
	}
}

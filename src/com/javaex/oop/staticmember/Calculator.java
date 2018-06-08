package com.javaex.oop.staticmember;

public class Calculator {

	public static final double PI = 3.14159;
		//static final 상수
	
	public static double getSum(double ... nums) {
		double total = 0;
		
		for(double num1:nums) {
			total += num1;
		}
		
		return total;
	}
	
}

package com.javaex.oop.staticmember;

public class CalculatorApp {

	public static void main(String[] args) {
//		static 변수의 사용
//		인스턴스 변수 없이 활용 가능
		double area = 10 * 10 * Calculator.PI;
		double total = Calculator.getSum(1,2,3,4,5,6,7,8,9,10);
		
		System.out.println(area);
		System.out.println(total);

	}

}

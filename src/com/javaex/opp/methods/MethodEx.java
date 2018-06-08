package com.javaex.opp.methods;

public class MethodEx {

	public static void main(String[] args) {
		printMessage();	//매개변수, 리턴 없는 메서드(void가있음)

		double squared = square(3.5);
		System.out.println(squared);
		
		System.out.println("4 + 5 = "+ getSum(4,5));
		
		printDvidide(4,0);
	}
	public static void printDvidide(int num1, int num2) {
		if(num2 == 0) {
			System.out.println("0으로 나눌수 없어요");
			return; //실행종료 (위치 뒤로 돌려준다)
		}
		System.out.println(num1 / num2);
	}
	
//		매개변수는 개수 제한은 없음
	public static double getSum(double num1, double num2) {
		return num1 + num2;
	}
	public static void printMessage() {
		System.out.println("Message");
//		static 을 넣은 이유는 static이 없으면 메모리에 적재 되지 않는다.
	}
	
//	리턴값과 매개변수가 있는 메서드
	public static double square(double num) {
		return num * num;
	}
}

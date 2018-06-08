package com.javaex.basic.var;

public class IntLongEx {
	public static void main(String[] agrs) {
//		int 변수의 선언
		int intVar1;
		int intVar2;
		
		intVar1 = 2018;
//		intVar2 = 1234567890123;  int의 범위를 벗어남
		
		System.out.println(intVar1);
		
//		Long 변수의 선언
		long longVar1;
		long longVar2;
		
		longVar1 = 2018;
		longVar2 = 1234567890123L;
		
		System.out.println(longVar1);
		System.out.println(longVar2);
		
//		2진수, 8진수, 16진수
		int bin;
		int oct;
		int hex;
		
//		2진수는 0b를 붙여야 한다. 필터링 작업할때 많이 사용한다.
		bin = 0b1100;
//		8진수는 0만 붙여주면 된다.
		oct = 072;
//		16진수는 0x
		hex = 0xFF;
		
		System.out.println(bin);
		System.out.println(oct);
		System.out.println(hex);
	}
}

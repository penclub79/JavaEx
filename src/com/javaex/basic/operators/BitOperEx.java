package com.javaex.basic.operators;

public class BitOperEx {
	public static void main(String[] args) {
//		비트연산
//		주로 하드웨어 제어, 이미지 프로세싱 등
//		미세한 단위 데이터 제어에 사용
		byte b1 = 0b1101;
		byte b2 = 0b0111;
		
//		byte result = b1 & b2;
//		int로 알기때문에 int로 바꿔야한다.
		int result = b1 & b2;	// bit and연산
		System.out.println(Integer.toBinaryString(result));
		//2진수 형태의 래퍼클래스
		
		result = b1 | b2;	// bit or연산
		System.out.println(Integer.toBinaryString(result));
	
		result = b1 ^ b2;	// bit xor연산
		System.out.println(Integer.toBinaryString(result));
		
		result = ~b1;	//bit not연산
		System.out.println(Integer.toBinaryString(result));
	}
}

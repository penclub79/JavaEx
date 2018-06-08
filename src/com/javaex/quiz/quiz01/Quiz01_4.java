package com.javaex.quiz.quiz01;

public class Quiz01_4 {
	public static void main(String[] args) {
		byte b = 10;
		char ch = 'A';
		int i = 100;
		long l = 1000L;
		
		byte b2 = (byte)i; 		//o
		char ch2 = (char)b; 	//o
		short s = (short)ch;	//o
		float f = l;		//x필요없어
		int i2 = ch;		//x필요없어
		
		System.out.println(b2);
		System.out.println(ch2);
		System.out.println(s);
		System.out.println(f);
		System.out.println(i2);
	}
}

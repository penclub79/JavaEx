package com.javaex.basic.var;

public class ExplicitCastingEx {
	public static void main(String[] args) {
		byte b;
		int i = 2018;
		float f = 123.456f;
		
		b = (byte)i;
		System.out.println("int " + i +" -> byte : " + b);
		
		i = (int)f;
		System.out.println("float " + f + " -> int : " + i);
		
	}
}

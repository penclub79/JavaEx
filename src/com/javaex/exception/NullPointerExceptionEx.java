package com.javaex.exception;

public class NullPointerExceptionEx {

	public static void main(String[] args) {
//		제일 흔하게 발생하는 Exception
		String str = new String("Hello");
		
		str = null;
		
		try {
			System.out.println(str.toString());
		}catch(NullPointerException e) {
			System.out.println("Null입니다.");
		}

	}

}

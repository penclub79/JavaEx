package com.javaex.exception;

import java.io.IOException;
//외부
public class ThrowExceptApp {

	public static void main(String[] args) {
	ThrowsExcept except = new ThrowsExcept();
	try {
		except.executeException();
		except.executeRuntimeException();
	}catch(RuntimeException e) {
		System.out.println("Message : "+ e.getMessage());
	}catch(IOException e) {
		e.printStackTrace();
	}
	
	try {
		System.out.println(except.divide(100, 0));
	}catch(ArithmeticException e) {
		System.out.println("0으로 못나눈다고");
	}
	
	System.out.println(except.divide(100, 0));

	}

}

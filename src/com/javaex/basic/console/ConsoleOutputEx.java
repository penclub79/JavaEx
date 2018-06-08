package com.javaex.basic.console;

public class ConsoleOutputEx {

	public static void main(String[] args) {
		//System.out.print   : 개행 안함
		//System.out.println : 개행 함
		//System.out.printf  : ?
		
		System.out.print("Hello\t");
		System.out.println("Java");
		
		String str1 = "Hello";
		String str2 = "Java";
		
		System.out.println(str1 + "  " +str2);
//		String에다 다른 데이터 타입 즉, 기본 타입을 합치면 
//		문자열이 된다.
		
//		이스케이프 문자
		System.out.println("Hello\nJava");//강제 개행
		System.out.println("Hello\tJava");//탭문자
		System.out.println("Hello, \"Java\"");
		System.out.println("\\역슬래시");
//		역슬래시 문자가 필요한 이유 : 파일의 이동경로를 쓸때, 서버이동경로
//		역슬래시를 필요로 한다. 
	}

}

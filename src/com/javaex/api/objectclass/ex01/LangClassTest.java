package com.javaex.api.objectclass.ex01;

public class LangClassTest {

	public static void main(String[] args) {
		Point p = new Point(10,10);
		System.out.println(p.getClass().getName());
							//패키지명 클래스명
		System.out.println(p.hashCode());
							//해쉬코드
		System.out.println(p.toString());
							//@16진수표기로 된 내용
		System.out.println(p);
							//위와 마찬가지로 메모리주소가 나옴
	}
}

package com.javaex.api.wreapper;

public class WrapperEx {

	public static void main(String[] args) {
		// 기본: 만들기
		Integer i = new Integer(10);
		Character c = new Character('c');
		// jdk9에서 new Wrapper는 deprecated
		Float f = Float.valueOf(3.14159f);
		Boolean b = Boolean.valueOf(true);
		
		//문자열로 넣어도 됩니다
		Integer i1 = Integer.valueOf("10");
		Double d1 = Double.valueOf("3.14159");
		Boolean b1 = Boolean.valueOf("false");
		// 주의 : 문자열의 형태가 해당 기본형의 형태를 갖춰야 한다
		
		// 자동 박싱(Auto Boxing)
		Integer i2 = 10;	// == Integer i2 = Integer.valueOf(10); 이과정이 생략(자동)
		
		// parse 계열 메서드 : 문자열을 이용, 해당 타입으로 변환, 다른 형태로 출력
		System.out.println(Integer.parseInt("-123"));	// 문자열 -> 정수
		System.out.println(Integer.parseInt("10", 16));	//10은 16진수의 10이다.(16진수 문자열->정수) ★★★
		System.out.println(Integer.toBinaryString(28));	//이진수 문자열로
		System.out.println(Integer.toHexString(28));	//16진수 문자열로
		// 형변환
		System.out.println(i2.doubleValue()); 	//double형으로 형변환
		
		//포장된 값의 비교
		Integer i3 = Integer.valueOf(2018);
		Integer i4 = Integer.valueOf(2018);
		System.out.println(i3.intValue() == i4.intValue());
		System.out.println(i3 == i4);	// 주소값이 다르다 왜냐면 객체로 포장되어 있어서 이럴때 언박싱이 필요하다/
		
		
		//언박싱 비교
		System.out.println(i3.intValue() == i4.intValue());
		//언박싱 비교2
		System.out.println(i3.equals(i4));
		
		Boolean i5 = Boolean.valueOf(i3.intValue() == i4.intValue());
		System.out.println(i5);
		
		
		
		
	}

}

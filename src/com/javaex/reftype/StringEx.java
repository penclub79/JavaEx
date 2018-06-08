package com.javaex.reftype;

public class StringEx {

	public static void main(String[] args) {
//		문자열 선언
		String str;	//선언
		str = "Java";	//리터널 Literal
		String str2 = "Java";	//리터럴
		String str3 = new String("Java");	//리터럴이 아니다 new로 할당해서
//		하지만 세변수는 같은 값을 가지고 있다.
//		 ==은 주소를 비교한다.
		System.out.println(str == str2);	//참
		System.out.println(str2 == str3);	//거짓	(다른주소를 가지고 있어서)
		
//		값을 비교
		System.out.println(str.equals(str3));	//참  (같은 값을 가짐)
		
	}

}

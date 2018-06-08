package com.javaex.api.stringclass;

public class StringEx {

	public static void main(String[] args) {
		String s1 = "Java";	//리터럴
		String s2 = new String("Java");	// 메모리에 새로 만들기
		String s3 = "Java";	
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		
		//String 생성자
		char[] letters = {'J' , 'a' ,'v','a'};
		String s4 = new String(letters);
		
		//valueOf 메서드
		String s5 = String.valueOf(3.14159f);
		//new 안해서 static 메서드
		
		//유용한 메서드
		String str = "Java Programming is Fun?";
		System.out.println(str.charAt(5));	//5번인덱스의 char
		System.out.println(str.indexOf("Fun"));
		System.out.println(str.indexOf("fun"));//인덱스 내에 없으면 -1로 나온다.
		
		//replace 바꾸기
		System.out.println(str.replace('?', '!'));
		System.out.println(str.replaceAll("Fun", "Funny"));
		//문자열의 Fun을 모두 Funny로 바꾸기
		
		System.out.println(str);
		//문자열을 모두 바꾸는 것은 한번 바뀌고 다시 돌아온다 
		//하지만 위처럼 한 글자를 바꾸면 고정.
		
		String s6 = " 			Hello		";//빈공간(띄워쓰기) = 화이트스페이스
		String s7 = ", Java";
		
		
		s6 = s6.trim(); //화이트스페이스 날리기
		System.out.println(s6+s7);
		
		//문자열 분리 : split();
		String[] split = str.split(" ");
		System.out.println(split);
		
		for(String data: split) {
			System.out.println(data);
		}

	}

}

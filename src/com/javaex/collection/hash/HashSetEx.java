package com.javaex.collection.hash;

import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
//		선언
		HashSet<String> hs = new HashSet<>();
		
//		객체 추가
		hs.add("Java");
		hs.add("C");
		hs.add("C++");
		hs.add("Python");
		hs.add("Java");
//		순서가 중요하지 않지 자료가 입력된다
//		HashSet은 집합 성격을 띄고 있어서 Java가 하나다
		
		System.out.println(hs);
		System.out.println("hs size = "+ hs.size());
		
//		지정한 객체를 포함하고 있는가? : contains()
		System.out.println(hs.contains("C++"));
		System.out.println(hs.contains("Linux"));
		
//		객체 삭제
		hs.remove("C++");
		System.out.println(hs);
		
//		다시 삭제해도 특별히 에러는 나지 않는다.
		hs.remove("C++");
		

	}

}

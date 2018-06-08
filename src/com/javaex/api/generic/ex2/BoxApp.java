package com.javaex.api.generic.ex2;

public class BoxApp {

	public static void main(String[] args) {
		// Box 하나 만들고 int 값을 설정
//		Box<Integer> intBox = new Box<Integer>(); 예전에는 이렇게 썼다.
		Box<Integer> intBox = new Box<>();
		intBox.setContent(123);	//integer가 지정됐다.
//		intBox.setContent("Java"); <-이미 integer라서 컴파일시 오류체크
//		안정성을 보장해준다.

		//값을 꺼내보자
		int retVal = intBox.getContent();	// 캐스팅 불필요
		System.out.println(retVal);
		
		
		
		Box<String> strBox = new Box<>();	//오브젝트파일이라서 
		strBox.setContent("Java");
		
		String strVal = strBox.getContent(); // 캐스팅 불필요
		System.out.println(strVal);
		
		//만약 캐스팅을 잘못 했다면?
//		strVal = (String)intBox.getContent();
		//컴파일 타임에서 체크 : 안정성 확보
		
	}

}

package com.javaex.api.generic.ex1;

public class BoxApp {

	public static void main(String[] args) {
		// Box 하나 만들고 int 값을 설정
		Box intBox = new Box();
		intBox.setContent(123);

		//값을 꺼내보자
//		int retVal = intBox.getContent(); <-오류난다
		int retVal = (int)intBox.getContent();
		System.out.println(retVal);
		
		Box strBox = new Box();	//오브젝트파일이라서 
		strBox.setContent("Java");
		
//		String strVal = strBox.getContent(); 실제 사용할 타입으로 변환시켜야함
		String strVal = (String)strBox.getContent();
		System.out.println(strVal);
		
		//만약 캐스팅을 잘못 했다면?
		strVal = (String)intBox.getContent();
		
	}

}

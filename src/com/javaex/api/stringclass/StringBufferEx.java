package com.javaex.api.stringclass;

public class StringBufferEx {

	public static void main(String[] args) {
//		버퍼의 생성
		StringBuffer sb = new StringBuffer("This");
		//직접 생성자에 문자열을 지정해도 된다.
		
		//문자열 추가 : append()
		sb.append(" is pencil");
		
		//문자열 삽입 : insert()
		sb.insert(8, "my");
		
		//문자열 치환 : replace()
		sb.replace(8, 12, "your");
		
		System.out.println(sb);
		
		sb.setLength(10);// 버퍼 길이 변경
		System.out.println(sb);
//		
//		String s = new StringBuffer("This")
//				.append(" is")
//				.append(" pencil")
//				.insert(8, "my")
//				.replace(8, 10, "your ")
//				.toString();
//		실무에서 많이 쓰인다.
		
//		다른 방법
		StringBuffer sb2 = new StringBuffer("This")
				.append(" is")
				.append(" pencil")
				.insert(8, "my")
				.replace(8, 10, "your ");
		String s = sb2.toString();
		System.out.println(s);

	}

}

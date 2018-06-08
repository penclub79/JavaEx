package com.javaex.collection.hash;

import java.util.HashSet;

//권장하는 방식이 아니다.
class SimpleNum{
	int num;
	
	public SimpleNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.valueOf(num);
	}

	//hashCode, equals를 오버라이드
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof SimpleNum) {
			SimpleNum other = (SimpleNum)obj;	//다운 캐스팅
			return num == other.num;
		}
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
//		return super.hashCode();
//		return num;	이렇게 해도 해시 검색이 가능한데 1차적으로 구분하여 해시의 장점을 누릴수있게 만든다.
		return num % 10;
//		해시코드 값을 효율적으로 검색하기위해 위와 같이 % 10으로 출력결과가 [10, 20]이 나올수 있게 된다.
	}
	
	
}
public class HashSetEx2 {

	public static void main(String[] args) {
		HashSet<SimpleNum> hs = new HashSet<>();
		
		SimpleNum s1 = new SimpleNum(10);
		SimpleNum s2 = new SimpleNum(20);
		SimpleNum s3 = new SimpleNum(20);
		
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		
		System.out.println(hs);
//		중복허용 하지 않은 HashSet이지만 다른 객체로 판단하여 중복을 한다. (메모리 주소번지가 다르기때문)
		System.out.println(s2.equals(s3));
//		false가 나온다 메모리 주소 번지가 다르기때문에
		
//		위 오버라이드와 다운캐스팅으로 다시 true가 나온다 즉 hashcode() 안에 equals()값이 같다고 판단하면
//		true가 출력된다.
	}

}

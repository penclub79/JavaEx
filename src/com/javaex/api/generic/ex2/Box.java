package com.javaex.api.generic.ex2;


// Generic 이용
public class Box<T> {	//아직 타입을 지정하지 않아 알수없다. 내부에서 사용할 타입을 외부에서 결정한다.

	T content;
	
	public T getContent() {	//Object -> T
		return content;
	}
	
	public void setContent(T content) {
		this.content = content;
	}
}

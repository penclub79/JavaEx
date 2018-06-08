package com.javaex.api.generic.ex3;


// Generic 이용
public class Box<K, V> {	//아직 타입을 지정하지 않아 알수없다. 내부에서 사용할 타입을 외부에서 결정한다.

	K key;
	V content;
	
	public V getContent() {	//T -> v
		return content;
	}
	
	public void setContent(V content) {
		this.content = content;
	}
	
	public K getKey() {
		return key;
	}
	
	public void setKey(K key) {
		this.key = key;
	}
}

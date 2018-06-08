package com.javaex.oop.casting;

public class Animal {
	protected String name;
	
	public Animal() {
		
	}/*
	//생성자
	public Animal(String name) {
		this.name = name;
	}*/
	
	//생성자를 명시적으로 만들어 놔서 자바 컴파일러의 기본생성자는 없어짐
	//명시적인 생성자가 없으면 컴파일러에 기본생성자가 있다.
	
	
	public void eat() {
		System.out.println(name + "is eating");
	}
	
	public void walk() {
		System.out.println(name + "is walking");
	}
}

package com.javaex.oop.goods.v3;

public class Goods {
//	필드 선언
	 private String name;
	 private int price;
	 
//	 생성자
//	 기본생성자
	 public Goods() {
		 
	 }
	 
//	 생성자2
	 public Goods(String name, int price) {
		 this.name = name;
		 this.price = price;
	 }
//	접근제한자를 표시하지 않으면 default 접근 제한자로 만들어진것
	 
//	 외부 접근을 위한 getter, setter
//	 Getters
	 public String getName() {
		 return name;
	 }
	 
	 public int getPrice() {
		 return price;
	 }
	 
//	 Setters
	 public void setName(String name) {
		 this.name = name;
	 }
	 
	 public void setPrice(int price) {
		 this.price = price;
	 }
	 
	 public void showInfo() {
		 System.out.println("상품명 : "+name);
		 System.out.println("가격 : "+price);
	 }
}

package com.javaex.practice01;

import java.util.Scanner;

public class Problem07 {

	public static void main(String[] args) {
		int jum; 
		String i = "y";
		
		System.out.println("===============");
		System.out.println("[숫자맞추기게임 시작]");
		System.out.println("===============");
		System.out.println("1~100까지 입력하셈");
		int an = (int) (Math.random()*100)+1;
		
		while(i.equals(i)){
		System.out.print(">>");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num > an) {
			System.out.println("Down");
		}
		else if(num < an) {
			System.out.println("UP");
		}
		else if(num == an) {
			System.out.println("맞췄습니다.");
			System.out.print("게임을 종료하시겠습니까?(y/n) : ");
			i = sc.next();
			break;
			}
		
		}
		System.out.println("==============");
		System.out.println("[숫자맞추기게임 종료]");
		System.out.println("==============");
	}

}

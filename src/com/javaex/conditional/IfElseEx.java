package com.javaex.conditional;

import java.util.Scanner;

public class IfElseEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//			표준 입력으로부터 Scanner 입력
//		System.out.print("점수를 입력하세요 : ");
//		int score = sc.nextInt();
//		
//		if (score >= 60) {
//			System.out.println("합격");
//		}
//		else
//			System.out.println("불합격");
		
//		if  -  else if  -  else
		System.out.println("정수를 입력하세요.");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("양수입니다.");
		}
		else if(num < 0) {
			System.out.println("음수입니다.");
		}
		else
			System.out.println("0입니다.");
	
//		 중첩 if
		if(num > 0) {
			System.out.println("양수입니다.");
		} else {
			if(num == 0) {
				System.out.println("0입니다.");
			} else {
				System.out.println("음수입니다.");
			}
		}
	}
}

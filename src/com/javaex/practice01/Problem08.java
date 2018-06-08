package com.javaex.practice01;

import java.util.Scanner;

public class Problem08 {

	public static void main(String[] args) {
		int a = 0 ;
		int b = 0 ;
		Scanner sc = new Scanner(System.in);
		int num = 4;
		int sum = 0;
		
		do {
		System.out.println("---------------------------");
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
		System.out.println("---------------------------");
		System.out.print("선택 > ");
		num = sc.nextInt();
		switch(num) {
		case 1 :
			System.out.print("예금액>");
			a = sc.nextInt();
			sum += a;
			break;
			
		case 2 :
			System.out.print("출금액>");
			b = sc.nextInt();
			sum = sum - b;
			break;
			
		case 3 :
			System.out.print("잔고액>"+sum);
			break;
			
		case 4 :
			System.out.print("프로그램 종료");
			break;
			
		default :
			System.out.println("다시입력해주세요");
			continue;
		}
		}while(num != 4);
	}
}


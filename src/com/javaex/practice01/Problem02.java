package com.javaex.practice01;

import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요.");
		int num = sc.nextInt();
		
		for(int a = 1 ;  a <= num ; a++) {
			for(int b = 1; b <= a ; b++) {
				System.out.print(a);
			}
			System.out.println();
		}
	}

}

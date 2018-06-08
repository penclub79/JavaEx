package com.javaex.practice01;

import java.util.Scanner;

public class Problem05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		
		System.out.println("숫자를 입력하세요.");
		for(int num = 1; num <= 5; num++) {
			System.out.print("숫자 : ");
			int sum = sc.nextInt();
			if(sum > max) {
				max = sum;
			}
			else {
				sum = max;
			}
			
		}
		System.out.println("최대값은 : " + max);
	}

}

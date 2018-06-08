package com.javaex.loop;

import java.util.Scanner;

public class WhileEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단을 입력하세요.");
		
		int dan = sc.nextInt();
		int i = 1;
		
		while(i <= 9) {
			System.out.println(dan + "x" + i + "=" + dan*i);
			i++;
		}
		sc.close();
	}

}

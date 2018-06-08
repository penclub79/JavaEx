package com.javaex.loop;

import java.util.Scanner;

public class ForLoopEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단을 입력하세요.");
		int dan = sc.nextInt();
		
		for(int i = 1; i < 10; i++) {
			System.out.println(dan + "x" + i + "=" + dan*i);
		}
		sc.close();
	}

}

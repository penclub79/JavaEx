package com.javaex.conditional;

import java.util.Scanner;

public class IfElseEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1: C, 2: C++, 3. Pyhone, 4. Linux ");
		int subject = sc.nextInt();
		
		if(subject == 1) {
			System.out.println("R101");
		}
		else if(subject == 2) {
			System.out.println("R202");
		}
		else if(subject == 3) {
			System.out.println("R303");
		}
		else if(subject == 4) {
			System.out.println("R404");
		}
		else
			System.out.println("관리자에게 문의하세요.");
		
		sc.close();

	}

}

package com.javaex.conditional;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1: C, 2: C++, 3. Pyhone, 4. Linux ");
		int sub = sc.nextInt();
		
		switch(sub) {
		case 1 :
			System.out.println("R101");
			break;
		case 2 :
			System.out.println("R202");
			break;
		case 3 :
			System.out.println("R303");
			break;
		case 4 :
			System.out.println("R404");
			break;
		default : 
			System.out.println("관리자에게 문의하세요.");
			break;
		}
		
		sc.close();

	}

}

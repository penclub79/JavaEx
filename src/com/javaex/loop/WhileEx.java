package com.javaex.loop;

public class WhileEx {

	public static void main(String[] args) {
		int num = 0;
		int total = 0;
		while(num < 100) {
			total += num;
			num++;
		}
		System.out.println(total);
	}

}

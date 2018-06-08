package com.javaex.quiz02;

public class Quiz02_2 {
	public static void main(String[] args) {
		int balls = 136;
		int cap = 10;
		
		int cnt = balls / cap;
		
		cnt =+ (balls % cap > 0 ? 1 : 0);
//		참이면 1을 더하고 거짓이면 0을 더한다.
//		이런 계산에서 유용하다.
		System.out.println(cnt);
	}
}

package com.javaex.api.objectclass.ex05;

public class Clonetest {

	public static void main(String[] args) {
		Scoreboard s1 = new Scoreboard(new int[] {10, 20, 30, 40});
		System.out.println("s1 = "+s1);
		
		Scoreboard s2 = s1.getClone();//복제한 스코어보드
		System.out.println("s2 = "+s2);
		
		s2.getScores()[0] = 50;
		
		System.out.println("s1 = "+s1);
		System.out.println("s2 = "+s2);
	}

}

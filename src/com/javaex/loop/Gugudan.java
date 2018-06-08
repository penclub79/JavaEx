package com.javaex.loop;

public class Gugudan {

	public static void main(String[] args) {
//		단수를 돌린다.
		int dan;
		for(dan = 2; dan <= 9; dan++ );
			for(int num = 1; num <= 9; num++)	{
				System.out.println(dan +"x" + num + " = " + dan * num);
			}
	}

}

package com.javaex.thread.ex01;

public class DigitThread extends Thread{
	// 메소드 오버라이드 시도   source -> run() 체크
	@Override
	public void run() {
//		새 쓰레드의 실행 흐름
		for(int i = 0; i < 30; i++) {
			System.out.println("DigitThread : "+i);
//			쓰레드 지연
			try {
				Thread.sleep(300);
			}catch(InterruptedException e) {
				
			}
		}
		super.run();
	}

}

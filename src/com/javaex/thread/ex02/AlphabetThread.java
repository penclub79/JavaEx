package com.javaex.thread.ex02;

public class AlphabetThread extends Thread {

	@Override
	public void run() {
		for(char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
			
//			출력속도 지연
			try {
				Thread.sleep(300);//1초다.
//				쓰레드는 예외발생이 잦아서 항상 해야함. 
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
		super.run();
	}

}

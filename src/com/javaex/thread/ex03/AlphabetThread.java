package com.javaex.thread.ex03;

public class AlphabetThread implements Runnable {
	//상속받은 쓰레드와 다른방법을 써야함.
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
	}

}

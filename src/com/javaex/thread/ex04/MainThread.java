package com.javaex.thread.ex04;

public class MainThread {

	public static void main(String[] args) {
//		쓰레드를 불러와 실행
//		Thread thread = new DigitThread();		// 상속 쓰레드의 새로운 스레드A 
		Thread thread = new Thread(new DigitThread());  //implement한 새로운 스레드 생성 A
		Thread thread2 = new Thread(new AlphabetThread());
		
		thread.setPriority(Thread.MAX_PRIORITY);	//max = 10
		thread2.setPriority(Thread.MIN_PRIORITY);	//min = 1
//		경쟁상황이 잘 발생하지 않아서 ex03과 결과가 비슷하지만 나중에 특정 상황에서 (A)thread냐 (B)thread냐 순서를 정하고 싶을때 설정하면된다.
//		쓰레드의 실행
		thread.start();
		thread2.start();

//		MainThread2에선 thread와 thread2를 메인 쓰레드의 흐름에 합류시키자.
		try {
			thread.join();	//thread합류
			thread2.join();	//thread2합류
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("메인쓰레드 종료");	
//		결과 : 메인스레드 합류로 메인쓰레드 종료가 맨 마지막에 나타난다.
//		메인스레드가 dead하면 다른 합류한 A,B스레드들끼리 통신을 못해서 흐름이 끊김.(기본적 흐름)
//		하지만 A,B가 통신을 하는 방법은 따로 있음.
	}

}

package com.javaex.thread.ex03;

public class MainThread {

	public static void main(String[] args) {
//		쓰레드를 불러와 실행
//		Thread thread = new DigitThread();// 상속 쓰레드의 새로운 스레드A 
		DigitThread d = new DigitThread();
		//d.run();
		
		 
		Thread thread = new Thread(new DigitThread());  //implement한 새로운 스레드 생성 A
//		쓰레드의 실행
		thread.start();
		
//		두개가 별도의 실행흐름을 가지고 있어서 같은 300이라도 따로 출력된다.
		
//		메인 쓰레드의 코드를 만들겠습니다.
//		-------------------------> AlphabetThread로 이동
//		for(char ch = 'A'; ch <= 'Z'; ch++) {
//			System.out.println(ch);
//			
////			출력속도 지연
//			try {
//				Thread.sleep(300);//1초다.
////				쓰레드는 예외발생이 잦아서 항상 해야함. 
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			} 
//		}
//		Thread thread2 = new AlphabetThread();	//"" "" B  //인터페이스방법은 이렇게 생성하면 오류난다.
		Thread thread2 = new Thread(new AlphabetThread());	//implement한 새로운 스레드 생성 B
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

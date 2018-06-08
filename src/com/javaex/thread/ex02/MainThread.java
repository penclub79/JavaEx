package com.javaex.thread.ex02;

public class MainThread {

	public static void main(String[] args) {
//		쓰레드를 불러와 실행
		Thread thread = new DigitThread();		//A흐름
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
		Thread thread2 = new AlphabetThread();	//B흐름
		thread2.start();
		
		System.out.println("메인쓰레드 종료");		//메인 쓰레드가 먼저 끝나니까 메인쓰레드 종료가 먼저 출력
//		따로 따로 흐른다.
	}

}

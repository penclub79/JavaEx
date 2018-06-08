package com.javaex.exception;

import java.io.IOException;
//내부
public class ThrowsExcept {
	public void executeException() throws IOException{
		System.out.println("강제 예외 발생");
		throw new IOException("강제 예외");	//예외를 던져본다
		//IO익셉션은 컴파일러가 꼭 체크해야한다. 그래 throws IOException을 적는다
	}
	//두번째 강제예외발생
	public void executeRuntimeException() {
		System.out.println("런타임 오류");
		throw new RuntimeException("Runtime Exception");
	}
	
	public double divide(int num1, int num2) {
		if(num2 == 0) {
//			System.out.println("0으로 나눌 수 없어요.");
////			return 0;
			throw new ArithmeticException();
			//내부에서 처리 못하겠다
			//외부에서 처리를 해달라는 의미
		}
		return num1 / num2;
	}
}

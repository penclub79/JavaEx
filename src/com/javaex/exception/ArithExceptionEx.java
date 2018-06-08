package com.javaex.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithExceptionEx {

	public static void main(String[] args) {
//		스캐너로부터 정수 입력
//		100을 정수로 나눈다
		double result = 0;
		int num;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 입력하세요 : ");
		
		//오류발생 가능 영역
		/*num = scanner.nextInt();
		
		
		result = 100/num;	// java.lang.ArithmeticException 오류메세지 
		*/
		//오류발생 가능 영역
		try {
			num = scanner.nextInt();
			result = 100/num;
		}catch(InputMismatchException e) {
			System.out.println("정수로 해주세요.");
		}catch(ArithmeticException e) {
			System.out.println("0으로는 나눌 수 없어요");
		}catch (Exception e) {	//최종처리(맨마지막으로 처리해야한다.)
			e.printStackTrace();
		}finally {	//try에서 통과하면 바로 finally로 오지만 통과못하면 순서대로 온다
			System.out.println("Finally");
		}//finally는 무조건 실행하게끔 되어있다.
		
		
		System.out.println(result);
		scanner.close();

	}

}

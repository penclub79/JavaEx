package com.javaex.io.bytestream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class ByteArrayStreamEx {

	public static void main(String[] args) {
//		Input 소스
		byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
//		Output 타겟
		byte[] outSrc = null;
		
//		Input 소스 확인
		System.out.println(Arrays.toString(inSrc));
		
//		인풋 스트림과 아웃풋 스트림을 열어 보겠습니다.
		try {
			//인풋 스트림 열기
			InputStream bis = new ByteArrayInputStream(inSrc);
			OutputStream bos = new ByteArrayOutputStream();
			int data = 0; //인풋 스트림으로부터 넘어오는 데이터 저장
			
			while((data = bis.read()) != -1) { //읽어올수 있다.(루프를 돌린다.)
				System.out.println("Read Data : "+data);
				bos.write(data);
			}
			
			outSrc = ((ByteArrayOutputStream)bos).toByteArray();	//다운캐스팅
			System.out.println(Arrays.toString(outSrc));
			
			bos.close();	//닫아주자
			bis.close();
		}catch(IOException e) {
			//IO 오류는 이곳에서 처리
		}catch (Exception e) {
			//위에서 처리되지 않은 예외는 이곳에서 처리
		}

	}

}

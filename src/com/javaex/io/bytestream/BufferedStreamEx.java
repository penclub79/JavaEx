package com.javaex.io.bytestream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedStreamEx {
	static String dirName = "D:\\javastudy\\files\\";
	static String source = dirName + "img.jpg";
	static String target = dirName + "img_copy.jpg";
	
	public static void main(String[] args) {
//		File 스트림을 열어 봅시다
		try {
		InputStream fis = new FileInputStream(source);
		OutputStream fos = new FileOutputStream(target);
		
//		전송속도 향상을 위해 버퍼 스트림을 엽시다.
		BufferedInputStream bis = new BufferedInputStream(fis);//메인 인풋 스트림을 넘겨주자!
		BufferedOutputStream bos = new BufferedOutputStream(fos);//메인 아웃풋 스트림을 넣어주자
		
//		데이터를 담을 byte배열을 생성
//		int data = 0; 과 밑에꺼와 비교해보자
		byte[] data = new byte[1024];	//1K 바이트 정도
//		int data는 1바이트 씩 끊어서 복사해서 느렸던것. 하지만 byte배열의 1k바이트로 끊어서 복사하니 훨씬 빠름.
		int size = 0;
		
		while((size = bis.read(data)) != -1) { //사이즈가 -1이 아닐때까지
			bos.write(data);
			System.out.println(size + "바이트 복사했습니다.");
		}
		
		
		bis.close();	//버퍼 닫기
		bos.close();
		
		System.out.println("파일을 복사했습니다.");
		
		}catch(FileNotFoundException e) {
			
		}catch(IOException e) {
			
		}
	}

}

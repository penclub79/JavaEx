package com.javaex.io.bytestream;

import java.io.File;
import java.io.IOException;

public class FileClassEx {
	//디렉토리 
	static String dirName = "D:\\javastudy\\files\\";
	
	public static void main(String[] args) {
//	파일객체
		File root = new File(dirName);
//		파일이 실제 존재하는 확인
		System.out.println(dirName + " : " + root.exists());
//		파일의 정보를 출력 (내용이 많을것같아 별도로 뺸다)
		printInfo(root);
		
//		디렉토리 안쪽에 파일을 만들어보자.
		File file = new File(dirName + "myfile.txt");//메모리상에 파일객체만 생성했다. 그래서 안보임
		if(!file.exists()) {	//파일이 없으면 생성
			try {	
			file.createNewFile();	//try를 안하면 예외발생의 문구가 뜬다
			}catch(IOException e) {
				System.out.println("파일을 만들지 못했어요.");
			}
		}
		
		printInfo(root);
		
		//파일 지우기
		file.delete();
		printInfo(root);
	}
	
	static void printInfo(File f) {
		System.out.println("-----------");
		
//		이 파일 객체가 디렉토리인지 확인 해보자
		if(f.isDirectory()) {
			System.out.println("Directory : "+ f.getName());
			File[] files = f.listFiles();
//			파일 리스트 출력
			for(File file : files) {	//files로부터 file한테 넘겨받을것
				System.out.print(file.isDirectory() ? "d " : "f ");
				System.out.println(file.getName());
			}
		}else {	//디렉토리 아닙니다.
			System.out.println("File : "+ f.getName());
		}
		System.out.println("-----------");
	}

}

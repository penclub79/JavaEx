package com.javaex.io.charstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class CharStreamEx {
	static String dirName = "D:\\javastudy\\files\\";
	static String fileName = dirName + "char.txt"; //dirname을 써야 만들어 진다.
	
	public static void main(String[] args) {
		//	파일 라이터를 열겠습니다.
		try {
		Writer fwriter = new FileWriter(fileName);
		fwriter.write("Bit Computer\r\n");	//윈도우 환경이라서 \r까지 포함
		fwriter.write("Java Programming\r\n");
		fwriter.write("2018.05");
		fwriter.flush();
		fwriter.close();
		
		// File Reader 열겠습니다.
		Reader freader = new FileReader(fileName);
		
		int data = 0;	//data를 읽어올 int변수  -1값이 되면 더이상 읽을게 없다.그래서
		while((data = freader.read()) != -1) {	//-1이 안될때까지 읽어라
//			System.out.print(data); 이대로하면 결과는 숫자로 나온다.
			System.out.print((char)data);
		}
		
		System.out.println();
		freader.close();
		
		}catch(FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없어요.");
		}catch(IOException e) {
			System.out.println("IOException");
		}

	}

}

package com.javaex.io.charstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class BufferedCharStreamEx {
	static String dirName = "D:\\javastudy\\files\\";
	static String source = dirName + "last-leaf.txt";
	static String target = dirName + "last-leaf-filtered.txt";
	
	//leaf, leaves 단어가 얼마나 있는지 확인 또는 가져오기(마지막잎새 파일에서)
	public static void main(String[] args) {
		try {
			Reader fr = new FileReader(source);
			Writer fw = new FileWriter(target);
			
//			보조 스트림을 열겠습니다.
			BufferedReader br = new BufferedReader(fr);
			BufferedWriter bw = new BufferedWriter(fw);
			
//			data를 읽어올 라인을 만든다. 글자읽음
			String line = "";
			while((line = br.readLine()) != null) {
//				라인을 소문자로 바꾸고 "leaf", "leaves"를 포함하는가 
				if(line.toLowerCase().contains("leaf")|| 
				line.toLowerCase().contains("leaves")){
								bw.write(line);
								bw.write("\r\n");
							}
			}
			
			
			
			br.close();	//보조 스트림 닫기
			bw.close();
			
			System.out.println("필터링 완료!!");
		}catch(FileNotFoundException e) {
			
		}catch(IOException e) {
			
		}
		

	}

}

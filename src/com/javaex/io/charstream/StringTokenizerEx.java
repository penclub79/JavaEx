package com.javaex.io.charstream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.StringTokenizer;

public class StringTokenizerEx {
	static String dirName = "D:\\javastudy\\files\\";
	static String fileName = dirName + "thieves.txt";
	
	public static void main(String[] args) {
//		스트림 열어봅새.
		try {
//			filename을 읽어올 filereader를 생성
			Reader freader = new FileReader(fileName);
			BufferedReader br = new BufferedReader(freader);
//			텍스트로부터 라인단위로 읽어올거야
			String thief;
			while((thief = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(thief,"\n");
//				스트링 토크나이저한테 더 있니?????????? 라고 물어봄
				while(st.hasMoreTokens()) {
					String token = st.nextToken();	//더 있다면 가져온다. 
					System.out.print(token + "\n");
				}
						System.out.println();
			}
			
			br.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}

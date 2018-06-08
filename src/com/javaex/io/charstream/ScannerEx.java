package com.javaex.io.charstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerEx {
	static String dirName = "D:\\javastudy\\files\\";
	static String fileName = dirName + "thieves.txt";
	
	public static void main(String[] args) {
		File file = new File(fileName);
		
		try {
			Scanner scanner = new Scanner(file);
//		 불러올 문자 형식들
			String name;
			float height;
			float weight;
			
			while(scanner.hasNextLine()) {//다음라인이 있는지 확인
				name = scanner.next();
				height = scanner.nextFloat();
				weight = scanner.nextFloat();
				
				System.out.printf("%s, 키:%f, 체중:%f\n", name, height, weight);
//				개행이 남아있으니까
				scanner.nextLine();//스캐너로부터 처리
			}
			
			scanner.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		

	}

}

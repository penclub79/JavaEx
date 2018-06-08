package com.javaex.io.bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileStreamEx {
	static String dirName = "D:\\javastudy\\files\\";
	static String source = dirName + "img.jpg";
	static String target = dirName + "img_copy.jpg";
	
	public static void main(String[] args) {
		try {
		//실제 경로하는 파일이 있어야하는데 없을 수 있기때문에 예외발생을 캐치해줘야한다.
		InputStream is = new FileInputStream(source);	
		OutputStream os = new FileOutputStream(target);
		
		int data = 0;
		
		//인풋 아웃풋에서는 예외발생이 많이 발생한다. 그래서 IOException을 쓴다.
		while((data = is.read()) != -1) {	
			os.write(data);
		}
		
		os.close();
		is.close();
		
		System.out.println("파일을 복사했어요.");	//복사할때 시간이 걸린다 나중에 해결하는 방법이 있다.
//												1byte씩 복사를해서 오래걸렸다. 버퍼를 이용하면 해결
		}catch(FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없어요.");
		}catch(IOException e) {
			System.out.println("IOException");
		}
		
	}

}

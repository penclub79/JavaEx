package com.javaex.io.bytestream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DataStreamEx {
	static String dirName = "D:\\javastudy\\files\\";
	static String fileName = dirName + "primitives.txt";
	
	public static void main(String[] args) {
		
		// 스트림을 열어봅새
		try {
			OutputStream fos = new FileOutputStream(fileName);
//			기본형 데이터 읽을수 있는 data output스트림
			DataOutputStream dos = new DataOutputStream(fos);
			
			dos.writeUTF("홍길동");
			dos.writeBoolean(true);
			dos.writeInt(25);
			dos.writeFloat(80.9f);
			
			dos.writeUTF("김길동");
			dos.writeBoolean(false);
			dos.writeInt(38);
			dos.writeFloat(99.9f);
			
			dos.close();
			
			InputStream fis = new FileInputStream(fileName);
//			기본형 데이터 읽을수 있는
			DataInputStream dis = new DataInputStream(fis);
//			데이터가 두개있어서 두번돌리도록 하겠습니다~~~~~~~~~
			for(int i = 0; i < 2; i++) {
//				주의 :  출력한 순서에 맞게 읽어와야함.
				String s = dis.readUTF();
				boolean b = dis.readBoolean();
				int val = dis.readInt();
				float f = dis.readFloat();
				
//				double d = dis.readDouble(); 하면 못읽는다. 더블
				
				System.out.printf("%s : %s: %d: %f\n",s, b, val, f);
			}
			
			dis.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {	//IOException도 함께 처리하자
			
		}

	}

}

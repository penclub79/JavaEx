package com.javaex.network.v5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {
	public static void main(String[] args) {
		Socket socket = null;
		
		try {
			//소캣 생성
			socket = new Socket();
			
			//시작메시지
			System.out.println("<클라이언트 시작>");
			System.out.println("[연결을 요청합니다.]");
			
			// Connect를 시도
			InetSocketAddress remote = new InetSocketAddress("127.0.0.1", 10000);
//			만약에 연결이 되었다면
			socket.connect(remote);
			System.out.println("<서버에 연결되었습니다.>");
			
//			서버로 메시지를 전송
			InputStream is = socket.getInputStream();
			Reader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			OutputStream os = socket.getOutputStream();
			Writer osw = new OutputStreamWriter(os, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
			
//			키보드에서 입력을 받아 봅시다.
			BufferedReader keyReader = new BufferedReader(new InputStreamReader(System.in));
			
			while(true) {
				String msg = keyReader.readLine();
				if(msg.equals("/q")) {
					System.out.println("접속을 종료하겠습니다");
					break;
				}
				bw.write(msg);
				bw.newLine();
				bw.flush();
				System.out.println("전송메시지 : "+msg);
				
//				에코백된 메시지를 받아오겠다.
				String rcvMsg = br.readLine();
				System.out.println("수신 메시지:"+rcvMsg);
			}
			
			String msg = "테스트 메세지"; //전송할 메시지
			bw.write(msg);
			bw.newLine();
			bw.flush();
			System.out.println("전송메시지: "+ msg);
			
			
//			Echo Back된 메시지를 받아서 출력
			keyReader.close();
			br.close();
			bw.close();
			
			//종료
			System.out.println("<클라이언트 종료>");
			
		}catch(ConnectException e) {
			System.out.println("[접속이 거부되었습니다.]");
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
			socket.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}

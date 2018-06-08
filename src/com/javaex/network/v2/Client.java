package com.javaex.network.v2;

import java.io.IOException;
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

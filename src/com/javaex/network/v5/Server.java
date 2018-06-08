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
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		//서버 소켓을 생성
		ServerSocket serverSocket = null;
		
		try {
		//바인드
		serverSocket = new ServerSocket();
		//127.0.0.1 은 내 무조건 내자신 포트이다.
		//그리고 포트는 프로그램들이 각자 하나의 포트를 맡고있어서 다른 포트로 피해야한다. 그래서 10000으로 지정
		InetSocketAddress local = new InetSocketAddress("127.0.0.1", 10000);	
		serverSocket.bind(local);
		
		// 시작 메시지를 출력
		System.out.println("<서버 시작>");
		System.out.println("[연결을 기다립니다.]");
		
		//연결을 기다려봅니다. : 대기상태
//		Socket socket = serverSocket.accept();	//외부에서 접속되기 전까지 쓰레드가 대기 중이다.
		while(true) {
			Socket socket = serverSocket.accept();
			Thread thread = new ServerThread(socket);
			thread.start();
		}
		
		
//		후처리
//		System.out.println("=========");
//		System.out.println("<서버 종료>");
		
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
			serverSocket.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}

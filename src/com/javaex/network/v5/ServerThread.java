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
import java.net.InetSocketAddress;
import java.net.Socket;

public class ServerThread extends Thread {
	//필드
	private Socket socket;
	private String client;
	
	//생성자
	public ServerThread(Socket socket) {
		this.socket = socket;
	}
	
	
	@Override
	public void run() {
		//클라이언트 접속시 처리
		try {
				InetSocketAddress socketAddress = (InetSocketAddress)socket.getRemoteSocketAddress();
				System.out.println("[클라이언트가 연결되었습니다.]");
//				클라이언트의 정보를 얻어오기
				System.out.println(socketAddress.getAddress()+" : "+socketAddress.getPort());
				
//				클라이언트로부터 메시지를 받아 봅시다
//				스트림을 열겠습니다.
				InputStream is = socket.getInputStream();
				Reader isr = new InputStreamReader(is,"UTF-8");	//메세지를 읽기위해서 한단계 버퍼를 선언한다.
				BufferedReader br = new BufferedReader(isr);
				
//				Echo Back을 위한 스트림을 열겠습니다.
				OutputStream os = socket.getOutputStream();
				Writer osw = new OutputStreamWriter(os,"UTF-8");	//메세지를 읽기위해서 한단계 버퍼를 선언한다.
				BufferedWriter bw = new BufferedWriter(osw);
				
				
//				메시지를 읽겠습니다.
				String msg; //클라이언트로부터 전송될 메세지를 하나 선언
				while(true) {
					msg = br.readLine();
					
					if(msg==null) {
						System.out.println("[접속 종료되었습니다.]");
						break;
					}
					System.out.println("Message : "+msg);
//					에코 백
					System.out.println("[Echo Back] : "+ msg);
					bw.write("[Echo] :"+msg);
					bw.newLine();
					bw.flush();
					
				}
				
				bw.close();
				br.close();
		}catch(IOException e) {
			
		}
		super.run();
	}
	
}

package com.javaex.network.v4;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {

	public static void main(String[] args) {
		try {
//			내 IP주소 확인(내부) -> 외부에서는 접속불가함
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("IP Adress : "+local.getHostAddress());
			
			String hostName = "www.naver.com";
			
			//www.google.com의 서버 IP를 받아와 봅새.
			InetAddress[] adrs = InetAddress.getAllByName(hostName);	//인터넷 어드레스를 변수에 넣기
			for(InetAddress remote:adrs) {
				System.out.println("HostName IP Address : "+remote.getHostAddress());
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}

}

package com.hun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class BasicUDPServer {

	DatagramSocket dsock; // 데이터 주고 받는 소켓
	DatagramPacket sPack; // 클라이언트로 sPakc : send/ rPack : receive
	DatagramPacket rPack; // 클라이언트로 sPakc : send/ rPack : receive
	InetAddress client; // 클라이언트 주소
	int sport = 7777, cport; // 클라이언트 접속 포트 번호 // 포트 번호가 충돌 할때 바꾸기 위해서

	public BasicUDPServer() {
	}// 기본 생성자

	public BasicUDPServer(int sport) {

		try {
			this.sport = sport;
			System.out.println("server >> 서버를 시작합니다");
			System.out.println("server >> 클라이언트가 접속하길 기다리고 있습니다");
			System.out.println("---------------------------------");
			this.dsock = new DatagramSocket(sport); // 데이터 그램 소켓 생성

			/**
			 * 현재 컴퓨터에서 지정된 포트번호로 데이터그램 소켓 생성 DatagramSocket serverSocket = new
			 * DatagramSocket(7777); // 정확하게 적용 현재 컴퓨터에서 사용 가능한 포트번호로 데이터그램 소켓 생성
			 * DatagramSocket serverSocket = new DatagramSocket(); // 남는 포토번호 아무거나 적용
			 */
		} catch (SocketException e) {

			System.out.println(e.getMessage());
		}
	}// BasicUDPServer 생성자 end

	/** 클라이언트와 소통하는 메서드 **/
	public void communicate() {
		try {
			// 키보드로부터 전송할 문자열을 입력받기 위해
			// BufferedReader 형태로 변환
			InputStreamReader isr = new InputStreamReader(System.in); // server
			BufferedReader br = new BufferedReader(isr);
			while (true) {
				byte[] buffer = new byte[1024];

				// 클라이언트에서 전송되는 DatagramSocket을 받기 위해
				// rPack 생성한 후 대기 -> 사용자가 그만할때 까지
				rPack = new DatagramPacket(buffer, buffer.length); // 한번에 영어 갯수 1024개 만들수 있는
//양쪽 대기 상태
				dsock.receive(rPack); // 클라이언트가 데이터를 전달하면 receive 메서드가 데이터를 감지(알람)

				// 전송받은 결과를 문자열로 변환.
				// String(byte[] bytes, int offest, int length); 무엇을, 어디부터, 얼마만큼
				String strln = new String(rPack.getData(), 0, rPack.getData().length);
				//무엇을, 어디부터, 얼마만큼							// 전달 받은 데이터, 0~ 받은 데이터의 길이 만큼
				client = rPack.getAddress(); // 클라이언트 주소 //답을 해주기 위해서 주소와 포트 번호를 가지고 온다
				cport = rPack.getPort(); // 클라이언트 포트 번호

				// 전송 받은 결과를 출력하고 quit이면 종료
				System.out.println("[클라이언트로부터" + client + ":" + cport + " ] " + strln);

				if (strln.trim().equals("quit")) {
					break;
				} // quit 문자열을 전송하기 전까지

				// 표준입력으로 입력된 정보를 DatagramSocket으로 만들어
				// 클라이언트에게 전송
				String strOut;

				strOut = br.readLine();
				sPack = new DatagramPacket(strOut.getBytes(), strOut.getBytes().length, client, cport);

				dsock.send(sPack);

			} //while()end
			System.out.println("UDP 서버를 종료합니다");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}// connection
}

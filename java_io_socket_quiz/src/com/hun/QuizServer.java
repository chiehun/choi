package com.hun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class QuizServer {

	public static void main(String[] args) throws IOException {//throws  IOException
		ServerSocket serverSocket = null;
		//ServerSocket DBSocket=null;
		
		try {
		//	DBSocket = new ServerSocket(3306);
			serverSocket = new ServerSocket(5555);
		
		} catch (IOException e) {
			System.out.println("다음의 포트 번호에 연결할 수 없습니다 : 5555");
			System.exit(1); //1을 넣는 이유는? 오류로 종료 했을때 exit 값은 1을 반환하기 때문에
		}
		
		Socket clientSocket = null; //클라이언트 소켓
		try {
			clientSocket = serverSocket.accept(); //apccept 접촉을 감지하는 메서드 에서 클라이언트 소켓을 만들어준다
		} catch (IOException e) {
			System.err.println("accept 실패");
			System.exit(1);
		}
	//---------------------클라이언트와 통신 준비 끝	//서버 소켓과 클라이언트 데이터 소켓을 다르다 serversocket, socket
		
		///--클라이언트와 통신시작----
		//PrintWriter out 은 클라이언트에게 전송하기 위한 객체......
		OutputStream clientOut = clientSocket.getOutputStream();
		PrintWriter out = new PrintWriter(clientOut, true); // true 생략 가능하다
		
		//InputStreamReader isr 과 BufferedReader in는 클라이언트가 입력한 내용
		InputStream clientlnput = clientSocket.getInputStream();
		InputStreamReader isr = new InputStreamReader(clientlnput);
		BufferedReader in = new BufferedReader(isr); // 통신 준비
		
		String inputLine, outputLine; //nputLine,들어오는 메서지 OutputLine //나갈때 메서지
		
		// -------------퀴즈 시작------------------------------------------------------------------
		DataBaseClass qp = new DataBaseClass();
		
		outputLine = qp.preocess(null);
		/**qp.preocess(null);
		 * 초기 client로 부터 전달받은 값이 없으므로 null를 전달하여
		 * 프로세스 시작.
		 * 향후, client가 전송한 값들을 전달.....
		 */
		out.println(outputLine); // "퀴즈를 시작합니다 y/n"를 출력
		/** 아래 부분은 client 가 입력밧을 전송했을 경우 실행. 그전에는 일시정지!! **/
		// 1. client : "y", "Y" 입력 후, 서버로 전송하면..... 
		// 2. client : "java.net" 입력 후, 서버로 전송하면..... 
		
		while ((inputLine = in.readLine()) != null) {	//inputLine ="Y", "y";	
			outputLine =qp.preocess(inputLine);// outpuLine="퀴즈를 시작합니다" // 
														// 1 . qp.preocess("y"); 또는 qp.preocess("Y");
														// 2.  qp.preocess("java.net");
			out.println(outputLine); //quit//1. "네트워크 처리 패키지는? 를 client에게 전송"=theQutput=problems[currentProblem];
			// 2. 정답 ~~(y/n) 또는 오답 ~~(y/n) 를 client에게 전송
			if(outputLine.equals("quit")) {
				break;
			}
		}//while() end
		out.close();
		in.close();
		clientSocket.close();
		serverSocket.close();
		
	}//main
}//class

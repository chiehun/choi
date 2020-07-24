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
			System.out.println("������ ��Ʈ ��ȣ�� ������ �� �����ϴ� : 5555");
			System.exit(1); //1�� �ִ� ������? ������ ���� ������ exit ���� 1�� ��ȯ�ϱ� ������
		}
		
		Socket clientSocket = null; //Ŭ���̾�Ʈ ����
		try {
			clientSocket = serverSocket.accept(); //apccept ������ �����ϴ� �޼��� ���� Ŭ���̾�Ʈ ������ ������ش�
		} catch (IOException e) {
			System.err.println("accept ����");
			System.exit(1);
		}
	//---------------------Ŭ���̾�Ʈ�� ��� �غ� ��	//���� ���ϰ� Ŭ���̾�Ʈ ������ ������ �ٸ��� serversocket, socket
		
		///--Ŭ���̾�Ʈ�� ��Ž���----
		//PrintWriter out �� Ŭ���̾�Ʈ���� �����ϱ� ���� ��ü......
		OutputStream clientOut = clientSocket.getOutputStream();
		PrintWriter out = new PrintWriter(clientOut, true); // true ���� �����ϴ�
		
		//InputStreamReader isr �� BufferedReader in�� Ŭ���̾�Ʈ�� �Է��� ����
		InputStream clientlnput = clientSocket.getInputStream();
		InputStreamReader isr = new InputStreamReader(clientlnput);
		BufferedReader in = new BufferedReader(isr); // ��� �غ�
		
		String inputLine, outputLine; //nputLine,������ �޼��� OutputLine //������ �޼���
		
		// -------------���� ����------------------------------------------------------------------
		DataBaseClass qp = new DataBaseClass();
		
		outputLine = qp.preocess(null);
		/**qp.preocess(null);
		 * �ʱ� client�� ���� ���޹��� ���� �����Ƿ� null�� �����Ͽ�
		 * ���μ��� ����.
		 * ����, client�� ������ ������ ����.....
		 */
		out.println(outputLine); // "��� �����մϴ� y/n"�� ���
		/** �Ʒ� �κ��� client �� �Է¹��� �������� ��� ����. �������� �Ͻ�����!! **/
		// 1. client : "y", "Y" �Է� ��, ������ �����ϸ�..... 
		// 2. client : "java.net" �Է� ��, ������ �����ϸ�..... 
		
		while ((inputLine = in.readLine()) != null) {	//inputLine ="Y", "y";	
			outputLine =qp.preocess(inputLine);// outpuLine="��� �����մϴ�" // 
														// 1 . qp.preocess("y"); �Ǵ� qp.preocess("Y");
														// 2.  qp.preocess("java.net");
			out.println(outputLine); //quit//1. "��Ʈ��ũ ó�� ��Ű����? �� client���� ����"=theQutput=problems[currentProblem];
			// 2. ���� ~~(y/n) �Ǵ� ���� ~~(y/n) �� client���� ����
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

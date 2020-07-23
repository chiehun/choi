package com.hun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class BasicUDPServer {

	DatagramSocket dsock; // ������ �ְ� �޴� ����
	DatagramPacket sPack; // Ŭ���̾�Ʈ�� sPakc : send/ rPack : receive
	DatagramPacket rPack; // Ŭ���̾�Ʈ�� sPakc : send/ rPack : receive
	InetAddress client; // Ŭ���̾�Ʈ �ּ�
	int sport = 7777, cport; // Ŭ���̾�Ʈ ���� ��Ʈ ��ȣ // ��Ʈ ��ȣ�� �浹 �Ҷ� �ٲٱ� ���ؼ�

	public BasicUDPServer() {
	}// �⺻ ������

	public BasicUDPServer(int sport) {

		try {
			this.sport = sport;
			System.out.println("server >> ������ �����մϴ�");
			System.out.println("server >> Ŭ���̾�Ʈ�� �����ϱ� ��ٸ��� �ֽ��ϴ�");
			System.out.println("---------------------------------");
			this.dsock = new DatagramSocket(sport); // ������ �׷� ���� ����

			/**
			 * ���� ��ǻ�Ϳ��� ������ ��Ʈ��ȣ�� �����ͱ׷� ���� ���� DatagramSocket serverSocket = new
			 * DatagramSocket(7777); // ��Ȯ�ϰ� ���� ���� ��ǻ�Ϳ��� ��� ������ ��Ʈ��ȣ�� �����ͱ׷� ���� ����
			 * DatagramSocket serverSocket = new DatagramSocket(); // ���� �����ȣ �ƹ��ų� ����
			 */
		} catch (SocketException e) {

			System.out.println(e.getMessage());
		}
	}// BasicUDPServer ������ end

	/** Ŭ���̾�Ʈ�� �����ϴ� �޼��� **/
	public void communicate() {
		try {
			// Ű����κ��� ������ ���ڿ��� �Է¹ޱ� ����
			// BufferedReader ���·� ��ȯ
			InputStreamReader isr = new InputStreamReader(System.in); // server
			BufferedReader br = new BufferedReader(isr);
			while (true) {
				byte[] buffer = new byte[1024];

				// Ŭ���̾�Ʈ���� ���۵Ǵ� DatagramSocket�� �ޱ� ����
				// rPack ������ �� ��� -> ����ڰ� �׸��Ҷ� ����
				rPack = new DatagramPacket(buffer, buffer.length); // �ѹ��� ���� ���� 1024�� ����� �ִ�
//���� ��� ����
				dsock.receive(rPack); // Ŭ���̾�Ʈ�� �����͸� �����ϸ� receive �޼��尡 �����͸� ����(�˶�)

				// ���۹��� ����� ���ڿ��� ��ȯ.
				// String(byte[] bytes, int offest, int length); ������, ������, �󸶸�ŭ
				String strln = new String(rPack.getData(), 0, rPack.getData().length);
				//������, ������, �󸶸�ŭ							// ���� ���� ������, 0~ ���� �������� ���� ��ŭ
				client = rPack.getAddress(); // Ŭ���̾�Ʈ �ּ� //���� ���ֱ� ���ؼ� �ּҿ� ��Ʈ ��ȣ�� ������ �´�
				cport = rPack.getPort(); // Ŭ���̾�Ʈ ��Ʈ ��ȣ

				// ���� ���� ����� ����ϰ� quit�̸� ����
				System.out.println("[Ŭ���̾�Ʈ�κ���" + client + ":" + cport + " ] " + strln);

				if (strln.trim().equals("quit")) {
					break;
				} // quit ���ڿ��� �����ϱ� ������

				// ǥ���Է����� �Էµ� ������ DatagramSocket���� �����
				// Ŭ���̾�Ʈ���� ����
				String strOut;

				strOut = br.readLine();
				sPack = new DatagramPacket(strOut.getBytes(), strOut.getBytes().length, client, cport);

				dsock.send(sPack);

			} //while()end
			System.out.println("UDP ������ �����մϴ�");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}// connection
}

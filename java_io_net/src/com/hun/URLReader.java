package com.hun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLReader {
	public static URL url;

	public URLReader() {

	}

	public URLReader(String site) {
		try {
			this.url = new URL(site);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void printage() {

		try {
			InputStream openURL = url.openStream(); // �ٷ� �� �� ���
			InputStreamReader inputSR = new InputStreamReader(openURL);
			BufferedReader inputBuffer = new BufferedReader(inputSR);

			String inLine = null;

			while ((inLine = inputBuffer.readLine()) != null) { // ���پ� ������ �ȴ� ���̻� ���� �� �� ������ ����
				System.out.println("readLine() => " + inLine);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	// ������ �������� ������ ������ ǥ����¿� ���
	public void printConnectiongInfo(URL site1) {

		try {
			URLConnection conn = url.openConnection();
			
			// url get �޼��� �����ϱ�
			System.out.println("openConnection =>" + conn);
			System.out.println("conn.getURL() => " + conn.getURL());
			System.out.println("conn.getConnectTimeout()=>"+conn.getConnectTimeout());
			System.out.println("conn.getContentEncoding() =>"+conn.getContentEncoding());
			System.out.println("conn.getContentLengthLong() =>" +conn.getContentLengthLong());
			System.out.println("conn.getContentType() =>"+conn.getContentType());
			System.out.println("conn.getDate()=> "+conn.getDate());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

}

package com.freeflux.util;

import java.io.UnsupportedEncodingException;

public class ChangeEncoding {

	public ChangeEncoding() { // �⺻ ������

	}
	// mySQL 5.1 ���� ����
		 // java => mySQL
	  public static String toLatin(String str){
	       try{
	            byte[] b=str.getBytes(); //getBytes ���ڿ��� Byte ������ �ɰ��� ��ȯ���ֽô� �޼��� String.getByte
	            return new String(b, "ISO-8859-1");   // ���� ������ ���־�� �Ѵ�
	            
	       }catch(UnsupportedEncodingException uee){
	            System.out.println("Encoding ERR : " +uee.getMessage());
	            return null; // return �� �ȵɼ��� �־ 
	       }
	  }
	  
	 // mySQL => Java 
	  public static String toUnicode(String str){
	       try{
	            byte[] b=str.getBytes("ISO-8859-1");
	            return new String(b);   
	       }catch(UnsupportedEncodingException uee){
	        System.out.println("Encoding ERR : " +uee.getMessage());
	            return null;
	      }
	  }
}

package com.freeflux.util;

import java.io.UnsupportedEncodingException;

public class ChangeEncoding {

	public ChangeEncoding() { // 기본 생성자

	}
	// mySQL 5.1 전용 파일
		 // java => mySQL
	  public static String toLatin(String str){
	       try{
	            byte[] b=str.getBytes(); //getBytes 문자열을 Byte 단위로 쪼개서 반환해주시는 메서드 String.getByte
	            return new String(b, "ISO-8859-1");   // 따로 컴퍼팅 해주어야 한다
	            
	       }catch(UnsupportedEncodingException uee){
	            System.out.println("Encoding ERR : " +uee.getMessage());
	            return null; // return 이 안될수도 있어서 
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

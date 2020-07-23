package com.hun;

import java.io.File;
import java.sql.Date;

public class Filelnfo {
// 파일 관련된 거 재정리 하기
	public static void main(String[] args) {
		String fname = "src/com/hun/FileInfo.java";
		// 객체 생성
		File f = new File(fname);
		System.out.println("파일" + f.getName() + "정보"); //파일 정보
		System.out.println();
		System.out.println("\t패스 : " + f.getPath());// 상대 경로
		System.out.println("\t절대패스 : "+f.getAbsolutePath()); //절대 경로(드라이브 //웹쪽에서 상태 경로)
		System.out.println("\t부모: " + f.getParent()); // 부모 주소 
		System.out.println("\t쓰기 여부 : "+ f.canWrite()); // 현재 쓰기 가능한 상태 인지 ture/false
		System.out.println("\t읽기 여부 : "+f.canRead()); //현재 읽기 가능한 상태 인지 ture/false
		System.out.println("\t파일 여부 : " + f.isFile()); //지정한 파일이 파일이면 ture/false
		System.out.println("\t폴더 여부 : "+ f.isDirectory());
		System.out.println("\t수정일 : " + new Date(f.lastModified())); // 최종 수정된 날짜 // 데이터 객체의 생성 날짜
		System.out.println("\t파일크기 : " +f.length()); // 파일의 크기  
		
		// new Date 정수를 날짜로 바꿔주는 함수
		

	}

}

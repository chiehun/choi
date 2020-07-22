package com.hun;

import java.util.Scanner;

import com.hun.xls.ExcellReader;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int  list  =10;    //list 추출 갯수
//int pageNo=1; // 사업자 입력번호
Scanner sc = new Scanner(System.in);
int pageNo=sc.nextInt();


int startIndex=0;// 추출시작번호
startIndex=pageNo*list-10;


System.out.println(startIndex);
System.out.println("============");

String uri ="c:/filetest/bank_data.xls";
ExcellReader.readExcelFile(uri, startIndex, list);


	}

}

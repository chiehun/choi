package com.hun;

import java.util.Scanner;

import com.hun.xls.ExcellReader;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int  list  =10;    //list ���� ����
//int pageNo=1; // ����� �Է¹�ȣ
Scanner sc = new Scanner(System.in);
int pageNo=sc.nextInt();


int startIndex=0;// ������۹�ȣ
startIndex=pageNo*list-10;


System.out.println(startIndex);
System.out.println("============");

String uri ="c:/filetest/bank_data.xls";
ExcellReader.readExcelFile(uri, startIndex, list);


	}

}

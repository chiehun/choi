package com.kkh.xls;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class ExcelMaker {

	public ExcelMaker() {
	}// 생성자

	public static void makeExclFile() {
		String uri = "C:/filetest/data.xls";
		File f = new File(uri);// 파일 객체 생성
		WritableWorkbook wb = null;

		try {
			wb = Workbook.createWorkbook(f);//WritableWorkbook값 
			
			WritableSheet s1 = wb.createSheet("첫번째", 0);//
			
			for (int i =0; i<10; i++) {
				Label label =new Label(0, i, "데이터=>"+i);
				s1.addCell(label);
				Label label1= new Label(1, i, "데이터=>"+i);
				s1.addCell(label1);
			}
			wb.write();
			wb.close();
		}catch(IOException e) {  //입출력 오류 예외처리
			System.out.println(e.getMessage());
		}catch(RowsExceededException e) { //행의 범위 벗어날때 예외처리
		System.out.println(e.getMessage());
	   }catch (WriteException e) {
		System.out.println(e.getMessage());
	}
}
}// 클래스

package com.kkh.xls;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelReader {

	public ExcelReader() {
	}

	// 엑셀 파일 데이터를 읽어들여 출력 메서드 선언
	public static void readExcelFile() {
		String uri = "C:/filetest/data.xls";
		File f = new File(uri); // 파일 클래스 선언 import file
		Workbook wb;// 읽기 전용 클래스 선언 import workbook
		try {
			wb = Workbook.getWorkbook(f); //C:/filetest/data.xls 파일을 읽어서 내용 저장
			Sheet s= wb.getSheet(0);// getSheet?! // sheet를 만들어서 저장
			
			int i =0;
			
			while(true) { //셀을 만들어서
				try {
					Cell c = s.getCell(0, i);
					Cell c1= s.getCell(1, i);
					System.out.println(c.getContents()+"\t"+c1.getContents());
					i++;					
				} catch (Exception e) {
					break;
				}
			}
		}catch (BiffException | IOException e1 ) {
				System.out.println(e1.getMessage());
			}
		}
	}


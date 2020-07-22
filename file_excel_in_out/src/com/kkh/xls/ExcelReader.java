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

	// ���� ���� �����͸� �о�鿩 ��� �޼��� ����
	public static void readExcelFile() {
		String uri = "C:/filetest/data.xls";
		File f = new File(uri); // ���� Ŭ���� ���� import file
		Workbook wb;// �б� ���� Ŭ���� ���� import workbook
		try {
			wb = Workbook.getWorkbook(f); //C:/filetest/data.xls ������ �о ���� ����
			Sheet s= wb.getSheet(0);// getSheet?! // sheet�� ���� ����
			
			int i =0;
			
			while(true) { //���� ����
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


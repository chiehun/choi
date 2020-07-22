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
	}// ������

	public static void makeExclFile() {
		String uri = "C:/filetest/data.xls";
		File f = new File(uri);// ���� ��ü ����
		WritableWorkbook wb = null;

		try {
			wb = Workbook.createWorkbook(f);//WritableWorkbook�� 
			
			WritableSheet s1 = wb.createSheet("ù��°", 0);//
			
			for (int i =0; i<10; i++) {
				Label label =new Label(0, i, "������=>"+i);
				s1.addCell(label);
				Label label1= new Label(1, i, "������=>"+i);
				s1.addCell(label1);
			}
			wb.write();
			wb.close();
		}catch(IOException e) {  //����� ���� ����ó��
			System.out.println(e.getMessage());
		}catch(RowsExceededException e) { //���� ���� ����� ����ó��
		System.out.println(e.getMessage());
	   }catch (WriteException e) {
		System.out.println(e.getMessage());
	}
}
}// Ŭ����

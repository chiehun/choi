package com.hun.xls;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcellReader {

	public ExcellReader() {
	}// �⺻ ������

	/**
	 * �׼� ���� �����͸� �о�鿩 ��� �޼��� ����
	 * 
	 * @param uri
	 *            : �о���� �������� ���/ ���� .xls
	 * @param startindex
	 *            : ���� index(��)
	 * @param list
	 *            : �ѹ��� �о�帱 ������ (��) ����
	 **/

	// ���� ��ü ����
	public static void readExcelFile(String uri, int startIndex, int list) {
		File f = new File(uri); // ���� ��ü ���� : c;// ���

		Workbook wb;// Workbook ��ü ���
		try {
			wb = Workbook.getWorkbook(f); // 2. �޼��忡�� file ��ü ����

			Sheet s = wb.getSheet(0); // 3. ��Ʈ ���(��Ʈ��ġ ����)

			int i = startIndex + 1;// ��Ʈ ���� �� ��ȣ
			int b = startIndex;
			int count = 0;
			int title = 12;
			while (true) {
				try {
					if (count < list) {// while �� ���������� ���ؼ�

						Cell c = s.getCell(0, i);
						Cell c1 = s.getCell(1, i);
						Cell c2 = s.getCell(2, i);
						Cell c3 = s.getCell(3, i);
						Cell c4 = s.getCell(4, i);
						Cell c5 = s.getCell(5, i);
						Cell c6 = s.getCell(6, i);
						Cell c7 = s.getCell(7, i);
						Cell c8 = s.getCell(8, i);
						Cell c9 = s.getCell(9, i);
						Cell c10 = s.getCell(10, i);
						// 5. ���κ��� ���� ����
						System.out.println(c.getContents() + " \t" + c1.getContents() + " \t" + c2.getContents()
								+ c3.getContents() + " \t" + c4.getContents() + " \t" + c5.getContents()
								+ c6.getContents() + " \t" + c7.getContents() + " \t" + c8.getContents() + " \t"
								+ c9.getContents() + " \t" + c10.getContents());

						i++;
						b++;
						count++;
					} else {//
						return;// �޼��� ������ ���� ������ ���̴� ����
					}
				} catch (Exception e) {
					break;
				}
			}
		} catch (BiffException | IOException e1) {

		}
	}
}

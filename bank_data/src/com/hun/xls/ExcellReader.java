package com.hun.xls;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcellReader {

	public ExcellReader() {
	}// 기본 생성자

	/**
	 * 액셀 파일 데이터를 읽어들여 출력 메서드 선언
	 * 
	 * @param uri
	 *            : 읽어들일 엑셀파일 경로/ 파일 .xls
	 * @param startindex
	 *            : 시작 index(행)
	 * @param list
	 *            : 한번에 읽어드릴 데이터 (행) 갯수
	 **/

	// 파일 객체 생성
	public static void readExcelFile(String uri, int startIndex, int list) {
		File f = new File(uri); // 파일 객체 생성 : c;// 경로

		Workbook wb;// Workbook 객체 얻기
		try {
			wb = Workbook.getWorkbook(f); // 2. 메서드에게 file 객체 전달

			Sheet s = wb.getSheet(0); // 3. 시트 얻기(시트위치 전달)

			int i = startIndex + 1;// 시트 내부 행 번호
			int b = startIndex;
			int count = 0;
			int title = 12;
			while (true) {
				try {
					if (count < list) {// while 문 빠져나오기 위해서

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
						// 5. 셀로부터 내용 추출
						System.out.println(c.getContents() + " \t" + c1.getContents() + " \t" + c2.getContents()
								+ c3.getContents() + " \t" + c4.getContents() + " \t" + c5.getContents()
								+ c6.getContents() + " \t" + c7.getContents() + " \t" + c8.getContents() + " \t"
								+ c9.getContents() + " \t" + c10.getContents());

						i++;
						b++;
						count++;
					} else {//
						return;// 메서드 완전히 빠져 나갈때 쓰이는 구문
					}
				} catch (Exception e) {
					break;
				}
			}
		} catch (BiffException | IOException e1) {

		}
	}
}

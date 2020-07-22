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
/** �׼�  ���� �����͸� �о�鿩 ��� �޼��� ����
 * @param uri				: �о���� �������� ���/ ���� .xls
 * @param startindex 	: ���� index(��)
 * @param list				: �ѹ��� �о�帱 ������ (��) ����
 **/
	
	// ���� ��ü ����
	public static void readExcelFile(String uri, int startIndex, int list) {
		File f= new File(uri); // ���� ��ü ���� : c;// ���
	
		Workbook wb;//Workbook ��ü ���
		try {
			wb= Workbook.getWorkbook(f); //	2. �޼��忡�� file ��ü ����
			
			Sheet s =wb.getSheet(0);				//3. ��Ʈ ���(��Ʈ��ġ ����)
			
			int i = startIndex+1;// ��Ʈ ���� �� ��ȣ
			int b=startIndex;
			int count=0;
			int title=12;
			while(true) {
				try {
					if(count<list) {// while �� ���������� ���ؼ�
						for(int a=0; a<title; a++) {					
							Cell cb= s.getCell(0, i);							
								//5. ���κ��� ���� ����						
						System.out.println(cb.getContents() +" \t");
						b++;
						}
						i++;
					
						count++;
						}else {// 
							return;// �޼��� ������ ���� ������ ���̴� ����
						}
				}catch (Exception e){
					break;
				}
			}
		} catch(BiffException | IOException e1) {
		
			}
		}
	}
			
			
			

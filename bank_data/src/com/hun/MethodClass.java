package com.hun;

import com.hun.xls.ExcellReader;

public class MethodClass {
	static ExcellReader er=null;
	
	public MethodClass() {
	}// ������

	public static String createHTML() {
		er= new ExcellReader();
		String tags = "";
		tags = tags + "<!doctype>";
		tags = tags + "<html>";
		tags = tags + "<head><title>Bank List</title></head>";
		tags = tags + "<body>";
		tags = tags + "<table broder'1'>";
				
		tags = tags + "<tr>";
		for(int i=0; i<11; i++) {		
				tags = tags +"<td>"+"</td>";//���� ������ ���� �Ѵ�. ���� ������ ���� ?!
		}
return "";
	}
}

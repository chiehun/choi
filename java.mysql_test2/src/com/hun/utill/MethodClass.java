package com.hun.utill;

import com.hun.obj.DataClass;
import com.hun.obj.ObjectClass;

public class MethodClass {

	public MethodClass() {
		}
/** 데이터를 이용해서 HTML 태그를 생성하는 메서드 선언
 * @return **/
 
		public static String makeTags() {
			String tags=""; // 누적 연산이 필요하기 때문에 ""/ null은 연산 불가!!
			tags= tags+"<!doctype html><head><title>List</title></head><body>";
			tags= tags+"<table border='1'>";
			tags= tags+"<tr><th>번호</th><th>아이디</th><th>비밀번호</th></tr>";
			
			//DataClass.member 내부에는 ObJectClass 객체들이 저장되어 있음...
			
			for(ObjectClass oc : DataClass.member) {
				tags=tags+"<tr>";
				tags=tags+"<td>"+oc.getNo()+"</td>";
				tags=tags+"<td>"+oc.getId()+"</td>";
				tags=tags+"<td>"+oc.getPw()+"</td>";
				tags=tags+"</tr>";
			}			
				tags= tags+"</table></body></html>";
				return tags;
		}// makeTage() end
}

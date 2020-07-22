package hun.com;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteClass {
	DateClass nw = null;
	public FileWriteClass() {//기본 생성자		
	}//생성자 END
//("경향신문", "nsd16500796.gif", "newsstand.naver.com/032",  "종합지"));
	//press					img						url										categroy
	/**지정한 파일에 내용 적기 **/
	
		public void writerFile() {
		String uri = "c:/filetest/java.html";
		FileWriter fw1=null;
		int count = 0;
		int a=10;
		int b=8;
		
		try {
			 fw1 = new FileWriter(uri);
			System.out.println("파일 쓰기 준비 완료");
			fw1.write("<!doctype html>");
			fw1.write("<html>");
			fw1.write("<heal><title>java2 => html</title></head>");
			fw1.write("<table border='2'>");//border 굵기
			for(int i=0; i<a; i++) {
				 fw1.write("<tr>");
				for(int n=0; n<b; n++) {
					fw1.write("<td>");
					fw1.write("<a href=http://"+nw.news.get(count).getUrl() +">");
					fw1.write("<img src=./newsImages/"+nw.news.get(count).getImg() +" / >");
					fw1.write("</a>");
					fw1.write("</td>");					
				}
					
				}	
			fw1.write("<table>");
			fw1.write("</body>");
			fw1.write("</html>");
			System.out.println("파일 쓰기 완료 ");
			fw1.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			
			e.printStackTrace();
		}		
	}// writeFile() END
	;
}

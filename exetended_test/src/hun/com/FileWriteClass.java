package hun.com;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteClass {
	DateClass nw = null;
	public FileWriteClass() {//�⺻ ������		
	}//������ END
//("����Ź�", "nsd16500796.gif", "newsstand.naver.com/032",  "������"));
	//press					img						url										categroy
	/**������ ���Ͽ� ���� ���� **/
	
		public void writerFile() {
		String uri = "c:/filetest/java.html";
		FileWriter fw1=null;
		int count = 0;
		int a=10;
		int b=8;
		
		try {
			 fw1 = new FileWriter(uri);
			System.out.println("���� ���� �غ� �Ϸ�");
			fw1.write("<!doctype html>");
			fw1.write("<html>");
			fw1.write("<heal><title>java2 => html</title></head>");
			fw1.write("<table border='2'>");//border ����
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
			System.out.println("���� ���� �Ϸ� ");
			fw1.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			
			e.printStackTrace();
		}		
	}// writeFile() END
	;
}

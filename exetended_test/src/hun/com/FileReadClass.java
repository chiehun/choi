package hun.com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadClass {

	public FileReadClass() {
		
	}//������
	public void readFiles() {
		//Fill-> ���� �Ǵ� ����(���丮) �˻�
		File f= new File("C:/hun/exetended_test/src/hun/com/FileReadClass");
		System.out.println(f.length());// ���� ũũ
		System.out.println(f.isFile());
		System.out.println(f.canRead());
		System.out.println(f.lastModified()); //������ ������ :10����
		f.list();// c���� �ȿ� �ִ� ���ϸ��� ���ڹ迭�� ��ȯ�� �ִ�
		// 197-.1.11 0.0.0 ������� �� �ð�
		String [] files=f.list();
		//for(String name : files) {
		//	System.out.println(name);
		}
		
//	}
	/** c://filetest�� memo.txt ������ �д� �޼��� 
	 * **/
	public void readFile()  {
		// 1. ���� ��� �� ����
		String uri ="C:/hun/exetended_test/src/hun/com/FileRead";//c:\ => c;/
		//2. ��θ��� �̿��Ͽ� �ش� ���� �б�
		// FileReader f =new FileReader("��θ�");// ��θ��� ������ ���ڿ�
		FileReader fr= null;// import �������� ����
		
		//3. ���� ������ �� ������ �о���� �� �ִ� Ŭ����(��ü) :
		// BuffereadReader.class(java.io ��Ű��)
		//BuffereadReader br= new BuffereadReader(FileReader ��ü :)
		//BuffereadReader�� readLine()�� �̿�...
		BufferedReader br=null;
		
		try {
			fr=new FileReader(uri);
			System.out.println("�б� ����");
			
			br = new BufferedReader(fr);
			//String line = br.readLine();
			//System.out.println(line);
			String sline =null;
			while ((sline=br.readLine())!=null) {
				System.out.println(sline);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}catch(IOException e) {
			System.out.println(e.getMessage());
			// TODO Auto-generated catch block
			e.printStackTrace();
		}// ���� ���� ó�� ��������
	}

}

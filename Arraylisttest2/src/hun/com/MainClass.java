package hun.com;

import java.util.ArrayList;
import java.util.Random;

public class MainClass {

	public static void main(String[] args) {
/**�ζ� ����� �����
		#1 ���� ����� 
		ArrayList 1~45 ���� ���� �� ���� �� �����
		    ������ ��ȣ�� ������ ������ �����
		    ������ ��ȣ�� �������� ������ �����
		    
		    #2. 1~45�� ���� �־��ֱ�
		    #3 ��ȣ�� �������� �����ϰ� remove ���� ���� ����ؼ� ���� ������ �ش�.
		    #4 Ǯ��
		      **/
		//#1 ���� �����ϱ�
		ArrayList<Integer> number=new  ArrayList <Integer>();
		ArrayList<Integer> lotto = new ArrayList <Integer>();
		Random ran = new Random();
		//#2
		for(int i=0; i<46; i++) {//1~45�� ���� �־��ִ� 
			number.add(i);
		}
		/**#3 ��ȣ�� �������� 6�� ��ȣ�� ����
		 * ������ ��ȣ�� �������� ���� ����
		 * for(int idx =0; idx<6; idx++)
		 * nextln//�� ����ϴµ� ������ ���� �ϳ��� ����� ������ number.size()�� ����Ѵ�
		 */
		int temp=0;
		for(int idx =0; idx<6; idx++) {
			temp =ran.nextInt(number.size());// ������ ���� ������ ���� ����
			lotto.add(number.remove(temp));	// ArrayList ���� ������ ���� ����
		}
		System.out.println("�ζ� ��ȣ");
		for(int idx=0; idx<6; idx++) {
			System.out.println(lotto.get(idx));
		}
		
	}//main() END
}


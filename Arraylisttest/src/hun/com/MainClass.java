package hun.com;

import java.util.ArrayList;
import java.util.Random;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//** �ζ� ��ȣ �����**/
		// �ζ� ��ȣ :1~45 ����.. : ArrayList
		//for( =1; <46, ) {  }
		
		// ������ ���� ��ȣ ���� : 6��(�ߺ��� ����)
		//Random.class => nextlnt(ArrayList.size())
		//(�ߺ��� ����) : ArrayList.class => remove(index)
		//6�� : for( ;      <6;    )
		
		//#1 1~45 ���� Array List �ȿ� ���� �ֱ�
		//1 array List ����
		ArrayList <Integer>numder =new ArrayList<Integer>();// 1~45 ���� ���� �� ��
		ArrayList<Integer>lottoNO =new ArrayList<Integer>();//�ε��� ��ȣ�� ����� ���� 
		Random rando= new Random();
				
		//2. for������ ArrayList ������ 1~45�� ���ڸ� ���� �ֱ�		
		for(int n=1; n<46; n++ ){
				numder.add(n);	
		}	
		//System.out.println(numder.size());
		int temp=0;// ������ index ��ȣ�� �ӽ� �����ϴ� �Լ�
		for(int t=0; t<6; t++) {
			temp=rando.nextInt(numder.size());//0~44 ������ index ��ȣ
			lottoNO.add(numder.remove(temp));
		}
		for(int t=0; t<6; t++) {
			System.out.println(lottoNO.get(t));
		}
			

		
		
		
	}
}//main() END


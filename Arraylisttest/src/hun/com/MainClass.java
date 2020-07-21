package hun.com;

import java.util.ArrayList;
import java.util.Random;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//** 로또 번호 추출기**/
		// 로또 번호 :1~45 까지.. : ArrayList
		//for( =1; <46, ) {  }
		
		// 무작위 추출 번호 갯수 : 6개(중복값 없음)
		//Random.class => nextlnt(ArrayList.size())
		//(중복값 없음) : ArrayList.class => remove(index)
		//6개 : for( ;      <6;    )
		
		//#1 1~45 까지 Array List 안에 집어 넣기
		//1 array List 선언
		ArrayList <Integer>numder =new ArrayList<Integer>();// 1~45 까지 저장 된 값
		ArrayList<Integer>lottoNO =new ArrayList<Integer>();//인덱스 번호를 추출된 점수 
		Random rando= new Random();
				
		//2. for문으로 ArrayList 안으로 1~45개 숫자를 집어 넣기		
		for(int n=1; n<46; n++ ){
				numder.add(n);	
		}	
		//System.out.println(numder.size());
		int temp=0;// 임의의 index 번호를 임시 저장하는 함수
		for(int t=0; t<6; t++) {
			temp=rando.nextInt(numder.size());//0~44 임의의 index 번호
			lottoNO.add(numder.remove(temp));
		}
		for(int t=0; t<6; t++) {
			System.out.println(lottoNO.get(t));
		}
			

		
		
		
	}
}//main() END


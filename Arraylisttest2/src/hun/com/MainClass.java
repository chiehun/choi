package hun.com;

import java.util.ArrayList;
import java.util.Random;

public class MainClass {

	public static void main(String[] args) {
/**로또 추출기 만들기
		#1 변수 만들기 
		ArrayList 1~45 값을 저장 할 변수 를 만든다
		    추출한 번호를 저장할 변수를 만든다
		    랜덤을 번호를 추출해줄 변수를 만들다
		    
		    #2. 1~45번 까지 넣어주기
		    #3 번호를 랜덤으로 추출하고 remove 리턴 값을 사용해서 따로 저장해 준다.
		    #4 풀력
		      **/
		//#1 변수 선언하기
		ArrayList<Integer> number=new  ArrayList <Integer>();
		ArrayList<Integer> lotto = new ArrayList <Integer>();
		Random ran = new Random();
		//#2
		for(int i=0; i<46; i++) {//1~45번 까지 넣어주는 
			number.add(i);
		}
		/**#3 번호를 랜덤으로 6개 번호를 추출
		 * 추출한 번호를 저장해줄 변수 선언
		 * for(int idx =0; idx<6; idx++)
		 * nextln//을 사용하는데 임의의 값을 하나씩 지우기 때문에 number.size()를 사용한다
		 */
		int temp=0;
		for(int idx =0; idx<6; idx++) {
			temp =ran.nextInt(number.size());// 임의의 수를 추출한 값을 저장
			lotto.add(number.remove(temp));	// ArrayList 값에 추출한 값을 저장
		}
		System.out.println("로또 번호");
		for(int idx=0; idx<6; idx++) {
			System.out.println(lotto.get(idx));
		}
		
	}//main() END
}


package com.hun;

public class EMPMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] age = { 27, 34, 28, 26, 41, 28, 42, 29, 29, 32 };
		int[] pay = { 460, 200, 250, 300, 300, 200, 350, 200, 400, 440 };
		String[] code = { "JP", "FR", "JP", "US", "CN", "DE", "KR", "JP", "DE", "KR" };
		// 국내에 근무하는 인원수
		// code 배열/인원수(int count=0)
		// 인원 수 : code배열의 값들 중 "KR"과 같은 지를 비교
		// 비교 : if(){}
		// if(code[0].equals("KR")){count++}
		int count = 0;
		for (int idx = 0; idx < code.length; idx++) {
			// count++; //count=count+1
			if (code[idx].equals("KR")) {
				count++;
			}
		}
		System.out.println("국내 근무자수 : " + count);
		// 국내 근무자의 급여합
		// 필요 자원 : code 배열/ pay 배열
		// 필요 구문 : for(){}/if(){}
		// 필요 변수 : int sum=0;
		// 합 구하기 : sum=sum+pay[idx]
		int sum = 0;
		String c = "KR";
		for (int idx = 0; idx < code.length; idx++) {
			if (code[idx].equals(c)) {
				sum = sum + pay[idx];
			}
			System.out.println("국내 근무자 급여 합 :" + sum);
			double avg = (sum * 1.0) / count;
			System.out.println("국내 근무자의 평균급여 : " + avg);

			String[] name = { "PJH", "JDW", "AJH", "HST", "HTW", "LWS", "LSD", "YJH", "JSW", "LKO" };
			// 국내 근무자의 명단을 출력하시오
			// 해당 명단을 이용하여 다른 일을 추가로 할 경
			// 출력 형식 : LSD, LKO
			// 필요 자원 : name 배열/ code 배열
			// 구문 : for(){}/if(){}

			// 필요 변수 String sumName="";
			// 합 구하기 : sumName=sumName+name[idx] + ",";
			String c2 = "KR";
			for (int f = 0; f < code.length; f++) {
				if (code[f].equals(c2)) {
					System.out.print(name[f] + ",");
				}
			}
		}
		String[] name = { "PJH", "JDW", "AJH", "HST", "HTW", "LWS", "LSD", "YJH", "JSW", "LKO" };
		String c3 = "KR";
		String sumName = "";
		for (int i = 0; i < code.length; i++) {
			if (code[i].equals(c3)) {
				sumName = sumName + name[i] + ",";

			}

		}
		System.out.println("국내 근무자 명단 :" + sumName);
		String[] names = sumName.split(",");
		System.out.println(names.length);
		System.out.println(names[0]);
		System.out.println(names[1]);
		String content = ""
				+ "경기남부경찰청 수사본부는 2일 기자회견을 열고 이춘재 사건 종합 수사결과를 발표했다. 이 자리에서 경찰은 이춘재가 14건의 살인과 9건의 강간 사건을 저지른 것으로 확인했다면서 이춘재가 (성적) 욕구를 풀기 위해 가학적 형태의 연쇄 범행을 한 것으로 확인했다고 밝혔다."
				+ "" + "" + "" + ""
				+ "하지만 화성 연쇄살인사건 등 이춘재가 벌인 살인 등 범죄는 2006년 4월 2일을 기점으로 공소시효가 모두 만료됐다. 이 때문에 이춘재에 대한 형사처벌은 불가능하다. " + ""
				+ "" + "" + ""
				+ "경찰은 프로파일러 면담 등을 통해 이춘재 심리를 분석한 결과 이춘재가 피해자의 아픔과 고통에 전혀 공감하지 못하고 있다며 자신의 범행과 존재감을 과시하고 타인의 관심을 받으려고 하는 등 사이코패스 성향이 나타난다고 했다. "
				+ "" + "" + "" + ""
				+ "이번 수사결과 발표는 지난해 경찰이 미제사건 증거물에 대한 DNA 감정을 의뢰해, 이춘재를 범인으로 특정한지 1년 만에 나왔다. 이춘재는 다른 살인 사건에 연루돼 무기징역을 선고받고 부산교도소에 복역중이었다. 이후 이춘재가 화성 연쇄살인사건 10건(1986~1991년 발생)을 포함, 범인이 잡히지 않은 14건의 살인사건을 추가로 자백했다. "
				+ "" + "" + "" + ""
				+ "과거 사건 수사 당시 경찰의 부실수사와 강압수사도 확인됐다. 이날 경찰은 32년전 수사과정에서 화성 8차 사건의 범인으로 윤모씨를 지목, 구속영장 발부 없이 3일간 부당하게 구금한 사실을 인정했다. 이 사건은 경기도 화성시 태안읍 진안리에서 13세 박모양이 자신의 집에서 성폭행을 당한 뒤 목이 졸려 살해된 사건이다. 윤모씨는 살인 누명을 쓰고 무기징역을 선고받고, 감형됐다가 20년간 억울한 옥살이를 한 뒤 2009년 가석방됐다. "
				+ "" + "" + "" + "" + "경찰은 또, 조사 과정에서 폭행 등으로 인한 허위자백과 허위 진술서 작성을 강요한 사실 등도 확인했다고 밝혔다. " + "" + "" + ""
				+ ""
				+ "배용주 경기남부경찰청장은 범인으로 몰려 20년간 억울한 옥살이를 한 윤모씨와 가족, 당시 경찰의 무리한 수사로 인해 피해를 입은 모든 분들께도 머리숙여 사죄드린다고 밝혔다."
				+  "";
		System.out.println(content);
		String[] words = content.split(" ");
		System.out.println(words.length);
		int cnt=0;
				for(int idx=0; idx < words.length; idx++) {
					if(words[idx].contains("이춘재")) {
						cnt++;
					}
				}
				System.out.println("노출횟수 : "+cnt);
	}//main() END
}//class END

// 국내 근무자의 평균 급여
// 필요 자원 : code 배열/ pay 배열
// 필요 구문 :

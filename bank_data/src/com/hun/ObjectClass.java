package com.hun;

public class ObjectClass {
	private int no = 0;      // 번호
	 private int age = 0;      // 나이
	 private String job = "";     // 직업
	 private String marital = "";    // 결혼여부 (기혼/미혼)
	 private String education = "";   // 학력 (unknown:알수없슴 / grad:대학원 / uiv:대학 / high:고등학교)
	 private String housing = "";   // 집소유 여부 (yes:보유 / no:없슴 / unknown:알수없슴)
	 private String loan = "";    // 대출여부 (yes:있슴 / no:없슴 / unknown:알수없슴)
	 private String contact = "";   // 연락 (cellular:스마트폰 / telephone:집전화)
	 private String month = "";    // 가입월 (jan:1월 / ... / dec:12월)
	 private String day_of_week = ""; // 가입요일 (sun:일요일~sat:토요일)
	 private int duration = 0;    // 기간 (날짜 일수)
	public ObjectClass() {
	}
	 /** 아래와 같은 문자열을 전달받아 변수에 대입하는 생성자 **/
	 // "1" "18" "student" "single" "unknown" "yes" "no" "cellular" "may" "thu" "183"
	 public ObjectClass(String no, String age, String job, String marital, String education, String housing, String loan,
	   String contact, String month, String day_of_week, String duration) {
	  this.no = Integer.parseInt(no);
	  this.age = Integer.parseInt(age);
	  this.job = job;
	  this.marital = maritalToKor(marital);
	  this.education = educationToKor(education);
	  this.housing = housingToKor(housing);
	  this.loan = loanToKor(loan);
	  this.contact = contactToKor(contact);
	  this.month = monthToKor(month);
	  this.day_of_week = day_of_weekToKor(day_of_week);
	  this.duration = Integer.parseInt(duration);
	 }
	
}

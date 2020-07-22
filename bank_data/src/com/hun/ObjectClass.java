package com.hun;

public class ObjectClass {
	private int no = 0;      // ��ȣ
	 private int age = 0;      // ����
	 private String job = "";     // ����
	 private String marital = "";    // ��ȥ���� (��ȥ/��ȥ)
	 private String education = "";   // �з� (unknown:�˼����� / grad:���п� / uiv:���� / high:����б�)
	 private String housing = "";   // ������ ���� (yes:���� / no:���� / unknown:�˼�����)
	 private String loan = "";    // ���⿩�� (yes:�ֽ� / no:���� / unknown:�˼�����)
	 private String contact = "";   // ���� (cellular:����Ʈ�� / telephone:����ȭ)
	 private String month = "";    // ���Կ� (jan:1�� / ... / dec:12��)
	 private String day_of_week = ""; // ���Կ��� (sun:�Ͽ���~sat:�����)
	 private int duration = 0;    // �Ⱓ (��¥ �ϼ�)
	public ObjectClass() {
	}
	 /** �Ʒ��� ���� ���ڿ��� ���޹޾� ������ �����ϴ� ������ **/
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

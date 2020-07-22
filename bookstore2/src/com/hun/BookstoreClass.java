package com.hun;

public class BookstoreClass {
	private String lmg="";
	private String bookname="";
	private String company="";
	private int pay=0;
	private String Codenumber="";
	private int discount=0;
	
	//DO it HTML 5 CSS 3__∞Ì∞Ê»Ò__¿Ã¡ˆΩ∫∆€∫Ì∏ÆΩÃ__16800__06365234__20
	
public  BookstoreClass (String lmg, String bookname, String company,  String pay, String Codenumber, String discount) {
	this.lmg=lmg;
	this.bookname=bookname;
	this.company=company;
	this.pay=Integer.parseInt(pay);
	this.Codenumber=(Codenumber+"jpg");
	this.discount=Integer.parseInt(discount);
}
private int stringCastInt(String n) {
	return Integer.parseInt(n);
}
	public String getLmg() {
		return lmg;
	}



	public String getBookname() {
		return bookname;
	}



	public String getCompany() {
		return company;
	}



	public int getPay() {
		return pay;
	}



	public String getCodenumber() {
		return Codenumber;
	}



	public int getDiscount() {
		return discount;
	}
public void test() {
	System.out.println(this.bookname+this.Codenumber+this.company+this.discount+this.lmg+this.pay);
}
}

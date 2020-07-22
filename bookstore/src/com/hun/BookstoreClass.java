package com.hun;

public class BookstoreClass {
	private String lmg="";
	private String bookname="";
	private String company="";
	private int pay=0;
	private int Codenumber=0;
	private int discount=0;
	
			
	
	
	//DO it HTML 5 CSS 3__∞Ì∞Ê»Ò__¿Ã¡ˆΩ∫∆€∫Ì∏ÆΩÃ__16800__06365234__20
	public BookstoreClass(String lmg, String bookname, String company,  int pay, int Codenumber, int discount) {
		this.lmg=lmg;
		this.bookname=bookname;
		this.company=company;
		this.pay=pay;
		this.Codenumber=Codenumber;
		this.discount=discount;
		
	}

	public BookstoreClass(String lmg2, String bookname2, String company2, String string, String string2,
			String string3) {
		// TODO Auto-generated constructor stub
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



	public int getCodenumber() {
		return Codenumber;
	}



	public int getDiscount() {
		return discount;
	}

}

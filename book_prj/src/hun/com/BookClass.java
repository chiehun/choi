package hun.com;

public class BookClass {
	
public String title="";			//제목
public String author="";	//저자
public String press="";		//출판사
public int price=0;				//가격
public String image="";		//책표지
public int dc=0;		//할인율
public int rPrice = 0; //실 판매가

public boolean cart=false;

//

	public BookClass(String t, String a, String p, int pr, String i, int d) { // 기본 생성자
		this.title=t;
		this.author=a;
		this.press=p;
		this.price= pr;
		this.image= i;
		this.dc=d;
		this.dcPrice();
		
	}
		public void dcPrice() {
			double dcPrice =this.price*(this.dc*0.01);
			this.rPrice=(int)(this.price-dcPrice);				
		}
		
		
	
}

package hun.com;

public class BookClass {
	
public String title="";			//����
public String author="";	//����
public String press="";		//���ǻ�
public int price=0;				//����
public String image="";		//åǥ��
public int dc=0;		//������
public int rPrice = 0; //�� �ǸŰ�

public boolean cart=false;

//

	public BookClass(String t, String a, String p, int pr, String i, int d) { // �⺻ ������
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

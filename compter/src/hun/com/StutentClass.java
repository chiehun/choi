package hun.com;

public class StutentClass {
public String stutnum=""; //학번
public String jumin="";//주민번호
public String name="";//이름
public int grade=0;
public String juso=""; //주소
public String Dnum="";//학과 번호
public int  age=0; //나이
public char gender='F';//성별
public double avg=0;
public int agesum;
//("1292001", "900424-1825409", "김광식", 3, "서울", "920");
	public StutentClass(String sdnum, String ju, String nam, int grd, String js, String dm) {
		this.stutnum=sdnum;
		this.jumin=ju;
		this.name=nam;
		this.grade=grd;
		this.juso=js;
		this.Dnum=dm;
		this.ageMethod(String front, String back);
		this.female();
		
	}
	
	String[] residents =this.jumin.split("-");
	String front=g[0].substring(0, 2);
	String back=g[1].substring(0, 2);	
	
	public  void female() {
		for(int idx=0; idx<DateClass.coms[idx].length(); idx++) {
			if()
			
		
			//	"1","2" 주민번호 남서 성별 저장
		for(int idx=0; idx<DateClass.stc[idx].jumin.length(); idx++) {
			if(sx.equals("2")) {			
		}
		
		}
	}
	public void ageMethod(String front, String back) {
		String[] g =this.jumin.split("-");
	    
	    int year=Integer.parseInt(ag);
	    if(ag.equals("1")||ag.equals("2")) {
	    	this.age=(2020-(1900+year));
	    }else{
	    	this.age=(2020-(2000+year));
	    }
	}
	System.out.println("학과명"+DateClass);
		
	}
	
	
}

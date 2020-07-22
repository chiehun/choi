package hun.com;

public class GePanClass {
	// 11968, "2020 07 08 클래스연습데이터7 (student, takes)" , "김광식", 25
	int writenumber = 0;
	String topic = "";
	String name = "";
	int seachnumber = 0;

	// 0#조회수의 평균을 구하는 메소드
	// 11968, "2020 07 08 클래스연습데이터7 (student, takes)" , "김광식", 25
	// #1 총조회수를 구하는 메소드
	// 변수 : 조회수를 저장하는 변수 전체 인원수를 저장하는 변수 조회수 , 전체 인원수
	// for를 사용하고 (강제변환)을 float로 강제 변환시켜준다.
	public GePanClass(int wrtnum, String tp, String nm, int seach) {
		this.writenumber = wrtnum;
		this.topic = tp;
		this.name = nm;
		this.seachnumber = seach;

	}

	// 전체 조회수를 구하는 메소드
	public  void seachsum(String a) {
			String seachsum=this.seachnumber+",";	// 문자열로 만들었음
			String sum[]=seachsum.split(",");		//["23"],["25"]
			String avg="";
			
			for(int idx=0; idx<topic.length(); idx++);{
				seachsum=((sum[0])+seachsum);
					}
			String avg=seachesum/topic.length();
	}
	public void avg() {
		int avg
		
	}
	}

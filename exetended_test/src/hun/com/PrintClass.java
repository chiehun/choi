package hun.com;

public class PrintClass extends Child{
	
	
	public PrintClass() {
		super(1000);//반드시 첫번째 줄에 선언
		
		System.out.println("PrintClass() 내부sdfsdf");
		
	}
	public void prn() {
		System.out.println("PrintClass의 prn() 실행");
	}

}

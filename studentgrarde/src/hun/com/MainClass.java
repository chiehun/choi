package hun.com;

public class MainClass {

	public static void main(String[] args) {		
		MethodClass.CreatMethod();
		
		String t=MethodClass.seachstudent("A");
		System.out.println(t);
		//MethodClass.seachstudent(t);
		
		String info []=MethodClass.seachdept(t);
		String a=MethodClass.fia(info[0]);
		
		
	}

}

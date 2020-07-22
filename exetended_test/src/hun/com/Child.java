package hun.com;

public class Child extends Parent {//2 번째
	int child = 100;
	public Child() {
		System.out.println("Child() 내부");
	}
	public Child(int n) {
		this.child=n;
	}
	
	public void prn() {
		System.out.println("부모의 prm() 실행");
	}
}







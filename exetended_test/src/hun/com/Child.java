package hun.com;

public class Child extends Parent {//2 ��°
	int child = 100;
	public Child() {
		System.out.println("Child() ����");
	}
	public Child(int n) {
		this.child=n;
	}
	
	public void prn() {
		System.out.println("�θ��� prm() ����");
	}
}







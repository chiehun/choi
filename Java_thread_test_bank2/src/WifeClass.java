
public class WifeClass extends Thread{

	public WifeClass() {
		}
	public void run() {
		MainClass.myBank.minusMoney(1000);   // ���� ���� ��� ó�� �ð� 0.2��
		
	System.out.println("minusMoney(1000)" + MainClass.myBank.getMoney());
	}
}

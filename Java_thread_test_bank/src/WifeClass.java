
public class WifeClass extends Thread{

	public WifeClass() {
		}
	public void run() {
		MainClass.myBank.minusMoney(1000);   // 은행 내부 출금 처리 시간 0.2초
		
	System.out.println("minusMoney(1000)" + MainClass.myBank.getMoney());
	}
}

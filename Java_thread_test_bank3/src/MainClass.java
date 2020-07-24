
public class MainClass {
	public static BankClass myBank = null;

	public static void main(String[] args) {
	myBank = new BankClass();
	
	System.out.println("현 잔액 : "+ myBank.getMoney());
	MeClass m = new MeClass();
	WifeClass w = new WifeClass();
	
	
	try {
		Thread.sleep(200); // 입금과 출금은 0.2초 차이/..//
		}catch (InterruptedException e){
			System.out.println(e.getMessage());
		}
	m.start();
	w.start();
	}

}

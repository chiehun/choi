
public class MainClass {
	public static BankClass myBank = null;

	public static void main(String[] args) {
	myBank = new BankClass();
	
	System.out.println("�� �ܾ� : "+ myBank.getMoney());
	MeClass m = new MeClass();
	WifeClass w = new WifeClass();
	
	
	try {
		Thread.sleep(200); // �Աݰ� ����� 0.2�� ����/..//
		}catch (InterruptedException e){
			System.out.println(e.getMessage());
		}
	m.start();
	w.start();
	}

}

public class BankClass {
 private int money = 10000;
	public BankClass() {		
	}//������

	public int getMoney() { // �ܾ� ��ȸ
		return this.money;
			}
	public void  setMoney(int money) {
	 this.money =money;
			}
	
	public void saveMoney(int save) {
		int m =this.getMoney();
		try {
		Thread.sleep(3000);  //�Ա� ó�� �ð� 3��
		} catch (InterruptedException e) {
			System.out.println(e.getMessage() +"�Ա� ����");
		}
		this.saveMoney( save +m);
	}
	public void minusMoney(int minus){
		int m =this.money;
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
		System.out.println(e.getMessage()+"��� ����");
		}
		this.minusMoney(minus-m);
				
}
}
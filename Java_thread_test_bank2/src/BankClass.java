public class BankClass {
 private int money = 10000;
	public BankClass() {		
	}//생성자

	public int getMoney() { // 잔액 조회
		return this.money;
			}
	public void  setMoney(int money) {
	 this.money =money;
			}
	
	public void saveMoney(int save) {
		int m =this.getMoney();
		try {
		Thread.sleep(3000);  //입금 처리 시간 3초
		} catch (InterruptedException e) {
			System.out.println(e.getMessage() +"입금 실패");
		}
		this.saveMoney( save +m);
	}
	public void minusMoney(int minus){
		int m =this.money;
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
		System.out.println(e.getMessage()+"출금 실패");
		}
		this.minusMoney(minus-m);
				
}
}
public class MeClass extends Thread {

	public MeClass(){
	
	}

	public void run() {
		MainClass.myBank.saveMoney(3000); //은행 내부 입금 처리 시간
		System.out.println("saveMoney(3000) : " + MainClass.myBank.getMoney());
	}


		
	}


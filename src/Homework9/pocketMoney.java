package Homework9;

class Money {
	int bank = 0;

	synchronized public void given(int money) {
		while (bank >= 3000) {
			System.out.println("餘額超過3000,停止匯款");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} // mom()裡的while
		bank += money;
		System.out.println("媽媽存入" + money + "餘額為" + bank);
		notifyAll();
		if (bank > 3000) {
			System.out.println("熊大被老媽告知帳戶已經有錢！");
		}
	} // given()

	synchronized public void spend(int money) {
		while (bank < money) {
			System.out.println("雄大看到餘額低於2000,要求匯款");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		bank -= money;
		System.out.println("雄大領出" + money + "餘額為" + bank);
		if (bank < 2000) {
			System.out.println("熊大看到餘額在2000以下，要求匯款");
			notifyAll();
			System.out.println("媽媽被熊大要求匯款！");
		}
	}
} // class taken 的括號

class mom extends Thread {
	Money money;

	public mom(Money money) {
		this.money = money;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			synchronized (money) {
				money.given(2000);
			}
		}
	}
}// class mom

class bear extends Thread {
	Money money;

	public bear(Money money) {
		this.money = money;
	}

	public void run() {
		for (int i = 1; i <= 10; i++)
			synchronized (money) {
				money.spend(1000);
			}
	}

}// class bear

public class pocketMoney {

	public static void main(String[] args) {
		Money money = new Money();
		mom m = new mom(money);
		bear b = new bear(money);
		m.start();
		b.start();

	}// main

}// pocketMoney

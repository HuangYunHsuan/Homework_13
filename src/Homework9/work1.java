package Homework9;

public class work1 implements Runnable {
	int eatrace = 1;
	String name;

	public work1() {
	}

	public work1(String name) {
		this.name = name;
	}

	public void run() {

		while (eatrace <= 10) {
			System.out.println(name + "吃第" + eatrace + "碗飯!");
			eatrace++;

			try {
				Thread.sleep((int) (Math.random() * 2501 + 500)); // 暫停生500～3000之間的毫秒數
			} catch (Exception e) {
			}
		}
		System.out.println(name + "吃完了!");
	}// run

	public static void main(String[] args) {

		work1 player1 = new work1("詹姆士");
		Thread t1 = new Thread(player1);
		work1 player2 = new work1("饅頭人");
		Thread t2 = new Thread(player2);
		System.out.println("=========大胃王快食比賽開始!!========");
		t1.start();
		t2.start();
		try {//執行續執行完後才列印出比賽結束
			t1.join();
			t2.join();
		} catch (InterruptedException e) {

		}
		System.out.println("=========大胃王快食比賽結束!!========");
	}

}// class work1

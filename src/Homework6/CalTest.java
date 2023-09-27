package Homework6;

import java.util.Scanner;

public class CalTest {

	public static void main(String[] args) {

		Scanner Cal = new Scanner(System.in);
		System.out.println("請輸入x的值");
		int x = Cal.nextInt();
		System.out.println("請輸入y的值");
		int y = Cal.nextInt();

		try {
			double result = Calculator.powerXY(x, y);
			System.out.println(x + "的" + y + "次方等於" + result);
		} catch (CalException a) {
			System.out.println(a.getMessage());
		} finally {
			Cal.close();
		}

	}

}

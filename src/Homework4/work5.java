package Homework4;

import java.util.Scanner;

public class work5 {
	public static void main(String[] args) {
		int y, m, d;
		try (Scanner ymd = new Scanner(System.in)) {
			System.out.println("請輸入年 月 日");
			y = ymd.nextInt();
			m = ymd.nextInt();
			d = ymd.nextInt();
		}
		int n = days(y, m, d);
		System.out.println("是" + y + "的第" + n + "日");

	}

	public static int days(int y, int m, int day) {
		int[] dayOfMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int days = day;
		for (int i = 1; i < m; i++) {
			days += dayOfMonth[i];

		}
		if (Leap(y) && m > 2) {
			days++;
		}

		return days;
	}

	public static boolean Leap(int year) {
		return (year % 200 == 0 ) || (year % 400 == 0);
	}
}

package Homework10;

import java.text.DecimalFormat;
import java.text.Format;
import java.text.NumberFormat;
import java.util.Scanner;
import java.math.BigDecimal;

public class work2 {

	public static void main(String[] args) {
		System.out.println("請輸入數字");

		Scanner sc = new Scanner(System.in);
		String i = sc.nextLine(); // 先假設所有輸入的所有都是字串
		boolean a = true;
		boolean b = true;
		String j = "";

		if (a) {
			j = i.trim(); // 將輸入的字串去掉空格後
			if (!(j.matches("\\d+"))) { // 確認剩餘的部分是不是數字(\d代表所有數字)
				System.out.println("這不是數字!請輸入數字!");
				i = sc.nextLine();// 再叫出scanner讓他重新輸入
			} else {
				a = false;
			}

		}

		// format: 按指定的目標格式把Date物件轉換為String

		System.out.println("欲格式化成(1)千分位(2)百分比(3)科學記號：");

		int choose = sc.nextInt();
		// NumberFormat類的format()方法可以使用BigDecimal物件作為其引數
		// 可以利用BigDecimal對超出16位有效數字的貨幣值,百分值,以及一般數值進行格式化控制
		BigDecimal d = new BigDecimal(j);
		while (b) {
			switch (choose) {
			case 1:
				Format f = new DecimalFormat("#,###.000");// 保留三位小數
				System.out.println("千分位的表示法為" + f.format(d));
				b = false;
				break;
			case 2:
				NumberFormat g = NumberFormat.getPercentInstance(); // DecimalFormat("##.00%");
				System.out.println("用百分比的方式表示為" + g.format(d));
				b = false;
				break;
			case 3:
				DecimalFormat h = new DecimalFormat("0.##E0");// 科學記號自動四捨五入
				System.out.println("用科學記號的方式表示為" + h.format(d));
				b = false;
				break;
			default:
				System.out.println("請重新選擇欲格式化成(1)千分位(2)百分比(3)科學記號：");
				choose = sc.nextInt();
				break;
			}
			sc.close();
		}

	}
}
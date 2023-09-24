package Homework;

import java.util.Scanner;

public class Homework3 {
//• 請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰
//	三角形、其它三角形或不是三角形,如圖示結果:
	public static void main(String[] args) {
		double a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a number");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		System.out.println(a + b + c);
		if (a <= 0 || b <= 0 || c <= 0) {
			System.out.println("不是三角形");
		}
		if (a + b <= c || b + c <= a || a + c <= b) {
			System.out.println("不是三角形");
		}

		if (a == b && b == c) {
			System.out.println("是正三角形");
		}
		if (a == b || a == c || b == c) {
			System.out.println("是等腰三角形");
		}
		if (a * a+ b *b == c*c ||c * c+ b *b == a*a ||a * a+ c *c == b*b ) {
			System.out.println("直角三角形");
		}else {
			System.out.println("其他三角形");
		}
		
		sc.close();

//     • 請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜
//      對則顯示正確訊息
		// 先產生亂數,不要印出來
		double i, j;
		i = (int) (Math.random() * 10);
		// 用scanner
		Scanner RandomNumber = new Scanner(System.in);
		System.out.println("來玩猜數字吧!");
		j = RandomNumber.nextInt();
		// 條件
		while (i == j) {
			System.out.println("猜對了!!");
			break;
		}
		while (i != j) {
			System.out.println("再試一次");
			j = RandomNumber.nextInt();
			if (i == j)
				System.out.println("猜對了!");
		}
		
		RandomNumber.close();
//		• 阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
//		厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇
//		的號碼與總數

		Scanner LottoNumber = new Scanner(System.in);
		System.out.println("阿文,請輸入你今天討厭的數字:");
		int L = LottoNumber.nextInt();
		int g = 0;
		int r = 0;
		for (int f = 1; f < 50; f++) {
			if (f % 10 != L && f / 10 != L) {
				System.out.print(f + " ");
				r++;
				g++;
			}
			while (r % 7 == 0) {
				System.out.println(" ");
				break;
			}
		}
		System.out.println("總共有" + (g) + "個數字可選");
	
		LottoNumber.close();
	}
	
}


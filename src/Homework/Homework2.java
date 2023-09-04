package Homework;

public class Homework2 {
	// 九九乘法表迴圈for+while
	public static void main(String[] args) {
		int i, j;
		for (i = 1; i <= 9; i++) {
			j = 0;
			while (j < 9) {
				j++;
				System.out.print(i + "*" + j + "=" + i * j + "\t");
			}
			System.out.println();
		}
		System.out.println("========================");
		// 九九乘法表迴圈for+do while
		for (int x = 1; x <= 9; x++) {
			int y = 1;
			do {
				System.out.print(x + " * " + y + " = " + (x * y) + "\t");
				y++;
			} while (y <= 9);
			System.out.println();
		}
		System.out.println("========================");
		// 九九乘法表迴圈while+do while

		int a = 1, b = 0;
		while ( a <= 9) {
			do {
				b++;
				System.out.print(a + "*" + b + "=" + a * b + "\t");
			} while (b < 9);
			a++;
			b = 0;
			System.out.println();
		}
		System.out.println("========================");

//請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
		int sum = 0;
		int count = 1;
		while (count <= 1000 && count % 2 >= 0) {
			sum += count;
			count++;
		}
		System.out.println(sum);
		System.out.println("========================");
//請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)	
		int product = 1;
		for (int c = 1; c <= 10; c++) {
			product *= c;
		}
		System.out.println(product);
		System.out.println("========================");
//請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
		int product2 = 1;
		int count2 = 1;
		while (count2 <= 10) {
			product2 *= count2;
			count2++;
		}
		System.out.println(product2);
		System.out.println("========================");
//請設計一隻Java程式,輸出結果為以下:
//1 4 9 16 25 36 49 64 81 100
		int d, e;
		for (d = 1; d <= 10; d++) {
			e = d * d;

			System.out.print(e + " ");

		}
		System.out.println(" ");
		System.out.println("========================");

//阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,
//輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
		int g = 0;
		for (int f = 1; f < 50; f++) {
			// 4,14,24,34,40~49都不行,除以10餘數為4及除以40餘數為0
			if (f % 10 != 4 && f / 40 != 1)
				System.out.print(f + " ");
			g++;
		}
		System.out.println(" ");
		System.out.println("========================");

//請設計一隻Java程式,輸出結果為以下:
		for (int h = 10; h >= 1; h--) {
			for (int k = 1; k <= h; k++)
				System.out.print(k + " ");
			System.out.println();
		}
		System.out.println("========================");
//請設計一隻Java程式,輸出結果為以下:
		char currentChar = 'A';

		for (int m = 1; m <= 6; m++) {
			for (int n = 1; n <= m; n++) {
				System.out.print(currentChar);
		}
		System.out.println(); // 換行
		currentChar++; // 將字符增加一個字母
		}
	}
}
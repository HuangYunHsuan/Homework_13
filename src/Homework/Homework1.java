package Homework;

public class Homework1 {

	// 12與6的積與和
	public static void main(String[] args) {
		int a = 12, b = 6;
		int plus = (a + b);
		int product = (a * b);

		System.out.println(plus);
		System.out.println(product);
		System.out.println("================");

		// 200顆雞蛋總共為幾打幾顆

		int eggs = 200, aDoz = 12;
		int dozen = (eggs / aDoz);
		int egg = (eggs % aDoz);

		System.out.println(dozen + "打");
		System.out.println(egg + "顆");
		System.out.println("================");

		// 請由程式算出256559秒為多少天、多少小時、多少分與多少秒

		int allsec = 256559, days = 24, hours = 60, mins = 60;
		int pmin = (allsec / mins);
		int sec = (allsec % mins);
		int phour = (pmin / hours);
		int min = (pmin % hours);
		int day = (phour / days);
		int hour = (phour % days);

		System.out.println(sec + "秒");
		System.out.println(min + "分");
		System.out.println(hour + "小時");
		System.out.println(day + "天");
		System.out.println("================");
		// 請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
		double Pi = 3.1415;
		int ra = 5;
		double per = (ra * 2 * Pi);
		double area = Math.pow(ra, 2) * Pi;

		System.out.println("圓周長為" + per);
		System.out.println("圓面積為" + area);
		System.out.println("================");

		// 某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本
		// 金加利息共有多少錢

		int PV = 150, Y = 10;
		double R = 0.02;
		double RV = PV * Math.pow((1 + R), Y);
		System.out.printf("%.4f萬元%n", RV);// "%.4f為取到小數點後第四位,%n為換行
		System.out.println("================");

//    //請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
//    	5 + 5
//    	5 + ‘5’
//    	5 + “5”
//    	並請用註解各別說明答案的產生原因
		int f = 5;
		System.out.println(f + 5);
		// 為單純的數字算式5+5,故得答案為10
		System.out.println(f + '5');
		// 第一個5為數字5,第二個'5'為數字5的int值,即止53
		//故5+53=58
		System.out.println(f + "5");
		// 第一個5為數字5,第二個'5'為字串,故得數字55
	}
}

package Homework10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class work3 {
	
	public static void main(String[]args) throws ParseException {
		System.out.println("請輸入日期(年月日，例如:20110131)：");
		
		Scanner sc = new Scanner(System.in);
		String date = sc.nextLine();
		
		
boolean day = true,  day2 = true;
		
		while(day) {
			if(!(date.matches("[0-9][0-9][0-9][0-9][0-1][0-9][0-3][0-9]"))) {
				System.out.println("日期格式不正確，請再輸入一次！");	
				date = sc.nextLine();
			}else {
				day = false;
			}
		}
		
		System.out.println("欲格式化成(1)年/月/日(2)月/日/年(3)日/月/年");
		int choose2 = sc.nextInt();	
		while(day2) {
			Date sfm = new SimpleDateFormat("yyyyMMdd").parse(date); //parse是把把String轉換為Date物件
			switch(choose2) {
			
			case 1:
				System.out.print(new SimpleDateFormat("yyyy/MM/dd").format(sfm)); //format是把Date物件轉換為String
				day2 = false;
				break;
			case 2:
				System.out.println(new SimpleDateFormat("MM/dd/yyyy").format(sfm));
				day2 = false;
				break;
			case 3:
				System.out.println(new SimpleDateFormat("dd/MM/yyyy").format(sfm));
				day2 = false;
				break;
			default:
				System.out.println("請重新選擇欲格式化成(1)年/月/日(2)月/日/年(3)日/月/年");
				choose2 = sc.nextInt();
				break;	
			}
		}
		
		sc.close();

	}// main的括號

}

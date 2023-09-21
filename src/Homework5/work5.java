package Homework5;

public class work5 {
	
	public static void genAuthCode() {
	
	String a ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	for (int i = 1; i <= 8; i++) { //跑出字母/數字共八個 所以只要跑八次
                 //用charAt從字串中取出字元
		System.out.print(a.charAt((int) (Math.random() * 62)));
		}                               //字串中63個字母/數字中的其中一個位置
	}
	
	public static void main (String[]args ) {
		
		genAuthCode();
	}

}

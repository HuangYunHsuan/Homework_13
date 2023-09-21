package Homework4;

public class work2 {
	public static void main(String[] args) {
		String s = "Hello World";
		int i = s.length()-1;   //i=10;
		while (i>=0) {           //i<s.lenth() 
			System.out.print(s.charAt(i));
			i--;
		}	
	}
}

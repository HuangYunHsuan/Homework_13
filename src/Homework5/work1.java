package Homework5;

import java.util.Scanner;

public class work1 {
	
	public static void main(String[] args) {
		int w, h;
		try (Scanner wh = new Scanner(System.in)) {
			System.out.println("請輸入寬與高");
			w = wh.nextInt();
			h = wh.nextInt();
		}
		starSquar(w,h);
	}
	//請設計一個方法為starSquare(int width, int height)
	

	
	public static void starSquar(int weight, int height) {
		
		for(int w = 0; w < height ; w++) {
			for(int h = 0; h < weight; h++) {
			System.out.print("*");
			
		}
			System.out.println();
		}
	}
}

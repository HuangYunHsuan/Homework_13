package Homework;

public class exm {
	public static void main(String[] args) {
		for (int f = 1; f < 50; f++) {
			// 4,14,24,34,40~49都不行,除以10餘數為4及除以40餘數為0
			if (f % 10 != 4 && f / 10 != 4)
				System.out.print(f + " ");
		}
	
		System.out.println(" ");
		System.out.println("========================");
	}
}
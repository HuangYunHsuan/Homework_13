package Homework5;

public class work2 {

	// 請設計一個方法為randAvg()
	// 從10個0~100(含100)的整數亂數中取平均值,並印出這10個亂數與平均值
    
	public static void randAvg() {
		int[] ten = new int[10];
		int i;
		int sum = 0;
		for (i = 0; i < ten.length; i++) {
			ten[i] = (int) (Math.random() * 101);

			System.out.print(ten[i] + " ");

			sum += (int) ten[i];
			
		}
		System.out.print("\n");
		System.out.print("平均為=" + sum / 10);
		
	}
	// 1 先生成十個亂數
	public static void main(String[] args) {
		randAvg();
	}
}

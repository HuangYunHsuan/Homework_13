package Homework4;

public class Homework4 {

	public static void main(String[] args) {
		int i;
		int sum = 0;
		int[] a = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		for (i = 0; i <= 9; i++) {
			sum += a[i];
		}
		System.out.println("平均=" + sum / i);

		int j = 0;
		while (j < 10) {
			if (a[j] > sum / i) {
				System.out.print(a[j] + " ");
				}
			j++;
		}

	}
}

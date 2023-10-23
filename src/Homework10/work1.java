package Homework10;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class work1 {
	// 創一個陣列,把亂數放進去,然後全部放進陣列

//	public static void main(String[] args) {
//		int i;
//		int[] numbers = new int[5];
//
//		for (i = 0; i < numbers.length; i++) {
//			numbers[i] = (int) (Math.random() * 101 + 1);
//			if (isPrime(numbers[i])) {
//				System.out.println(numbers[i] + "是質數");
//			} else {
//				System.out.println(numbers[i] + "不是質數");
//			}
//
//		}
//
//	}

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<Integer>();
		while (set.size() != 5) {
			int number = (int) (Math.random() * 100) + 1;
			set.add(number);
		}

		Iterator<Integer> i = set.iterator();
		while (i.hasNext()) {
			int number = i.next();// 假設是8
			boolean isPrime = true;

			if (number == 1) {
				isPrime = false;
			}
			for (int k = 2; k <= Math.sqrt(number); k++) {
				if (number % k == 0) {
					isPrime = false;
					break;
				} // if
			} // for

			System.out.print(number);
			if (isPrime) {
				System.out.println("是質數");
			} else {
				System.out.println("不是質數");
			}
		} // while

	}// main
}// class

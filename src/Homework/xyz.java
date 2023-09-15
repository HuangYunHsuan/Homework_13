package Homework;

public class xyz {
	public static void main(String[] args) {
		// my
		
//		int x[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
//		int y[][] = { { 10, 11, 12 }, { 13, 14, 15 }, { 16, 17, 18 } };
//
//		int z[][] = { { x[0][0] + y[0][0], x[0][1] + y[0][1], x[0][2] + y[0][2] },
//				{ x[1][0] + y[1][0], x[1][1] + y[1][1], x[1][2] + y[1][2] },
//				{ x[2][0] + y[0][2], x[2][1] + y[2][1], x[2][2] + y[2][2] }, };
//
//		for (int count = 0; count < 3; count++) {
//			for (int i = 0; i < 3; i++)
//
//				System.out.print(z[count][i] + " ");
//			System.out.println();
//		}

//		int a = (int) (Math.random() * 30 + 1);
//	System.out.println(a);

		// step 1: create three 3x3 arrays
		int[][] x = new int[3][3];
		int[][] y = new int[3][3];
		int[][] z = new int[3][3];

		// step 2: put random data to x array
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				x[i][j] = (int) (Math.random() * 31);
			}
		}

		// step 3: put random data to y array
		for (int i = 0; i < y.length; i++) {
			for (int j = 0; j < y[i].length; j++) {
				y[i][j] = (int) (Math.random() * 31);
			}
		}

		// step 4: add x and y and put to z array
		for (int i = 0; i < z.length; i++) {
			for (int j = 0; j < z[i].length; j++) {
				z[i][j] = x[i][j] + y[i][j];
			}
		}

		// step 5: print all arrays
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				System.out.print(x[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("===================");

		for (int i = 0; i < y.length; i++) {
			for (int j = 0; j < y[i].length; j++) {
				System.out.print(y[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("===================");

		for (int i = 0; i < z.length; i++) {
			for (int j = 0; j < z[i].length; j++) {
				System.out.print(z[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("===================");
		
	}
}
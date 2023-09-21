package Homework5;

public class work3 {
	int a, b, c, d;
	public int maxElement(int[][] x) {
		int count = 0;
		for (a = 0; a < x.length; a++) {
			for (b = 0; b < x[a].length; b++) {
				if (x[a][b] > count) {
					 count = x[a][b];
				}
			}
		}
		return count;

	}

	public double maxElement(double[][] y) {
		double times = 0;
		for (c = 0; c < y.length; c++) {
			for (d = 0; d < y[c].length; d++) {
				if (y[c][d] > times) {
					times = y[c][d] ;
				}
			}
		}		
		
		return times;
	}

	public static void main(String[] args) {
		
		int[][] intArray = {{1, 6, 3},{9, 5, 2}};
		double[][] doubleArray = {{1.2, 3.5, 2.2},{7.4, 2.1, 8.2}};

		
        work3 w = new work3();
        
		
        int maxInt = w.maxElement(intArray);
        double maxDouble = w.maxElement(doubleArray);
        
        // 輸出結果
        System.out.println("最大整數元素：" + maxInt);
        System.out.println("最大浮點數元素：" + maxDouble);


	}
}

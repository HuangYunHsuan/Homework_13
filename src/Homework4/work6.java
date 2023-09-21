package Homework4;

public class work6 {
	public static void main(String[] args) {
		int[][] grade = { 
				{ 10, 35, 40, 100, 90, 85, 75, 70 }, 
				{ 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 90 }, 
				{ 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 }, 
				{ 90, 80, 100, 75, 50, 20, 99, 75 } 
		};
		
		int[] studentno = new int[8]; //學生編號
		for(int m = 0; m < 6; m++ ) {    
			int count =0; 
			int no1 = 0;  // 將no1設定為0
			for(int n = 0; n < grade[m].length; n++) {
				if(grade[m][n] > no1) { //如果grade[m][n]>no1
					no1 = grade[m][n];  //那grade[m][n]就指定為no1 
					count = n;
			}
		}
			studentno[count] = studentno[count] + 1; //得出最高分者的學生編號
		}
		//每人考最高分次數
		for (int m = 0; m < 8; m++) {
			System.out.println((m + 1) + " 號同學考最高分的次數為" + studentno[m] + "次");
			}
	}
}
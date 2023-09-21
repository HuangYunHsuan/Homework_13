package Homework4;

import java.util.Scanner;

public class work4 {
    public static void main(String[] args) {
    	int[][] i= {
    			{25, 32, 8 ,19 ,87},
    		    {2500, 800, 500, 1000 ,1200}
    	};
    	try (Scanner sc = new Scanner(System.in)) {
			System.out.println("請輸入金額:");
			int a = sc.nextInt();
			
			int count = 0;
			System.out.print("有錢可借的員工編號: " );
			  for(int j = 0; j < i[0].length ; j++) {
				  if(i[1][j] >= a) {
					System.out.print(i[0][j]);
					System.out.print(" ");
					count++;
				} 
			}
			  System.out.print("共"+count+"人");
		}
    }

}

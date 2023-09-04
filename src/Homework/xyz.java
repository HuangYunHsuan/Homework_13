package xxx;

import java.util.Random;

public class xyz {
	public static void main(String[] args) {
		int x[][] = { 
				{ 1, 2, 3 }, 
				{ 4, 5, 6 }, 
				{ 7, 8, 9 } 
		};
		int y[][] = { 
				{ 10, 11, 12 }, 
				{ 13, 14, 15 }, 
				{ 16, 17, 18 }
		};

        int z[][] = {
     {x[0][0]+y[0][0],  x[0][1]+y[0][1],x[0][2]+y[0][2] },
     {x[1][0]+y[1][0],  x[1][1]+y[1][1],x[1][2]+y[1][2] },
     {x[2][0]+y[0][2],  x[2][1]+y[2][1],x[2][2]+y[2][2] },
        };
        
     for(int count=0;count<3;count++) {
    	 for(int i=0;i<3;i++)
    	 
     System.out.print(z[count][i]+" ");
     System.out.println();
     }
     
//		int a = (int) (Math.random() * 30 + 1);
//	System.out.println(a);
	}
	}
}

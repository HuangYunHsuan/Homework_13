package Homework4;

public class work3 {

	public static void main(String[] args) {
		String[] P = { "mercury, venus, earth, mars, jupiter,saturn, uranus, neptune" };
        int count = 0 ;
        
		for (int i = 0; i < P.length ; i++) { // 陣列P中的每一個行星名稱
			for (int j = 0; j < P[i].length(); j++) { //行星名稱中的每個字母
				char ch =(P[i].charAt(j));
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					count++;
				}
			}
		}
		System.out.print("母音總數="+ count );
	}

}

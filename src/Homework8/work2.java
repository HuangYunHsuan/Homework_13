package Homework8;

import java.util.Set;

import java.util.HashSet;
import java.util.Iterator;



public class work2 {

	public static void main(String[] args) {

		Train train1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		Train train2 = new Train(1254, "區間", "屏東", "基隆", 700);
		Train train3 = new Train(118, "自強", "高雄", "台北", 500);
		Train train4 = new Train(1288, "區間", "新竹", "基隆", 400);
		Train train5 = new Train(122, "自強", "台中", "花蓮", 600);
		Train train6 = new Train(1222, "區間", "樹林", "七堵", 300);
		Train train7 = new Train(1254, "區間", "屏東", "基隆", 700);

		//Set不重複
		Set<Train> sett = new HashSet<Train>(); 
		sett.add(train1);
		sett.add(train2);
		sett.add(train3);
		sett.add(train4);
		sett.add(train5);
		sett.add(train6);
		sett.add(train7);

		// 印出不重複的Train物件
		Iterator obj = sett.iterator();
		for (Train aTra : sett) {
			System.out.println(aTra.getNumber() +" " + aTra.getType() +" " + aTra.getStart() +" " + aTra.getDest() +" " + aTra.getPrice());
		}
		
        Iterator obj2 = sett.iterator();
        
	}


}
	
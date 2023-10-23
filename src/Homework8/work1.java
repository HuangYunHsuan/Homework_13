package Homework8;

import java.util.List;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class work1 {

	public static void main(String[] args) {

		List list = new ArrayList();
		list.add(new Integer(100));
		list.add(new Double(3.14));
		list.add(new Long(21L));
		list.add(new Short("100"));
		list.add(new Double(5.1));
		list.add("Kitty");
		list.add(new Integer(100));
		list.add(new Object());
		list.add("Snoopy");
		list.add(new BigInteger("1000"));

		// 用Iterator印出所有元素
		Iterator objs = list.iterator();
		while (objs.hasNext()) {
			System.out.println("useIterator =" + objs.next());
		}
		System.out.println("-----------------");
		// for

		for (int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			System.out.println("useFor=" + obj);
		}
		System.out.println("-----------------");
		// for-each

		for (Object x : list) {
			System.out.println("for-eash=" + x);
		}

		Iterator objs2 = list.iterator();
		while (objs2.hasNext()) {
			Object ob = objs2.next();
			if (ob instanceof Number) {
				System.out.print( ob + " ");
			}
		}
	}// main

}// class

package main;

import java.util.ArrayList;

public class Min {

	public static ArrayList Integer(ArrayList<Integer> a) {
		int min = a.get(0);
		for (int i = 0; i < a.size(); i++) {

			if (a.get(i) < min)
				min = a.get(i);

		}
		System.out.println("最小值是： " + min);
		return a;
	}

}
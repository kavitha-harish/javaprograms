package practice;

import java.util.ArrayList;
import java.util.Collections;

public class arraylist3 {

	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<>();
		list.add(10);
		list.add(80);
		list.add(200);
		list.add(170);
		list.add(100);
		list.add(180);
		Collections.sort(list);
		System.out.println("ascending order " + list);
		//decending order
		Collections.reverse(list);
		System.out.println("descending order " + list);
	}
}

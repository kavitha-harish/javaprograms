package ArrayPrograms;

import java.util.ArrayList;

public class array {

	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<Integer>();
		list.add(20);
		list.add(10);
		list.add(30);
		list.add(50);
		list.add(40);
		
		System.out.println(list);//[20,10,30,50,40]
		System.out.println(list.get(0));

	}

}

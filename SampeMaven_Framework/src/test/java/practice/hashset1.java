package practice;

import java.util.HashSet;

public class hashset1 {

	public static void main(String[] args) {
		HashSet set=new HashSet();
		set.add(10);
		set.add(10);
		set.add(20);
		set.add(null);//only one null, no duplicates values
		set.add(null);
		
		set.add("kavitha");
		System.out.println(set);
		

	}

}

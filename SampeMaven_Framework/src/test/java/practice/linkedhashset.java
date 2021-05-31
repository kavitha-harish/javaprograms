package practice;

import java.util.LinkedHashSet;

public class linkedhashset {

	public static void main(String[] args) {
		LinkedHashSet set=new LinkedHashSet<>();
		set.add(90);
		set.add(15);
		set.add(80);
		set.add(10);
		set.add(10);//should allow insertion point, no duplicate
		set.add("kavitha");
		System.out.println(set);
	}}

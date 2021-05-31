package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class hashset2 {

	public static void main(String[] args) {
		
		HashSet set=new HashSet();
		set.add(30);
		set.add(30);
		set.add(80);
		set.add(10);
		set.add(20);
		set.add(90);
		//way1
		System.out.println("before sorting "+set);
		TreeSet set1=new TreeSet(set);//by default ascending order
		System.out.println("after sorting "+set1);

		
		//way2
		
		ArrayList list=new ArrayList(set);//converting to list from set
		Collections.sort(list);//sorting using collections class
		System.out.println("using second method "+list);
		}}

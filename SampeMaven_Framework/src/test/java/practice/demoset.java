package practice;

import java.util.HashSet;
import java.util.TreeSet;


public class demoset {
	
	public static void main(String[] args) {
		
	HashSet value=new HashSet<>();
		value.add(20);
		value.add(50);
		value.add(70);
		value.add(50);
		value.add(25);
		
		
		
		TreeSet<Object> value2 = new TreeSet<>(value);
		
		System.out.println(value);
		System.out.println(value2);//ascending order
	}

}

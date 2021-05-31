package practice;

import java.util.ArrayList;
import java.util.Collections;

public class arraylist1 {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		 list.add(10);
		 list.add(10);//allows duplicate values
		 list.add("kavitha");//hetero
		 list.add('a');//hetero
		 list.add(null);
		 list.add(null);
		 Collections.sort(list);
		 System.out.println(list);
		 
		 System.out.println(list.get(0));//get value by giving index number
}}

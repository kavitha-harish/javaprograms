package practice;

import java.util.TreeMap;

public class treemap3 {

	public static void main(String[] args) {
		TreeMap map=new TreeMap<>();
		map.put("key1",10);
		map.put(null, "value2");
		System.out.println(map);
	}
}

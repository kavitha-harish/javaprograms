package RemoveDuplicatesPrograms;

import java.util.LinkedHashSet;

public class RemoveDuplicatesMethod2 {

	public static void main(String[] args) {
		String s="welcome";
		char[] ch = s.toCharArray();
		
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		for(int i=0; i<ch.length; i++)
		{
			set.add(ch[i]);
		}
		
		System.out.println(set);
		String rev="";
		for(Character chara:set) {
			rev=rev+chara;
		}
		System.out.println(rev);
	}
}

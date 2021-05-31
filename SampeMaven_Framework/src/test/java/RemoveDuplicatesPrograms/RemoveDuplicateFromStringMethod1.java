package RemoveDuplicatesPrograms;

import java.util.LinkedHashSet;

public class RemoveDuplicateFromStringMethod1 {

	public static void main(String[] args) {
		String s="welcome";
		char[] ch = s.toCharArray();
		
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		
		for(int i=0; i<ch.length; i++)
		{
			set.add(ch[i]);
		}
		for(Character chara:set) {
			System.out.print(chara);
		}
		}
		
	}


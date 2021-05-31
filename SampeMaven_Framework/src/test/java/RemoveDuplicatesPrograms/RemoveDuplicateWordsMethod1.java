package RemoveDuplicatesPrograms;

import java.util.LinkedHashSet;

public class RemoveDuplicateWordsMethod1 {

	public static void main(String[] args) {
		String s="welcome to india welcome to bangalore";
		String[] str = s.split(" ");
		
		LinkedHashSet<String>set=new LinkedHashSet<String>();
		for(int i=0; i<str.length; i++) {
			set.add(str[i]);
		}
		for(String str1:set) {
			System.out.print(str1+" ");//to give space between words cancat with " "
		}
	}

}

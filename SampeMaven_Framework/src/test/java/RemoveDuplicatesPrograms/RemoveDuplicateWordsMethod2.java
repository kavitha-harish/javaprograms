package RemoveDuplicatesPrograms;

import java.util.LinkedHashSet;

public class RemoveDuplicateWordsMethod2 {

	public static void main(String[] args) {
		String s="welcome to india welcome to bangalore";
		String[] str = s.split(" ");
		
		LinkedHashSet<String>set=new LinkedHashSet<String>();
		for(int i=0; i<str.length; i++) {
			set.add(str[i]);
		}
		
		String rev="";
		for(String str1:set) {
			rev=rev+" "+str1;
			}
		
		System.out.println(rev);
	}

	}



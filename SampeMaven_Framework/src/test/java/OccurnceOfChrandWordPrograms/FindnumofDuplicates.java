package OccurnceOfChrandWordPrograms;

import java.util.HashSet;

public class FindnumofDuplicates {

	public static void main(String[] args) {
		String s="environment";
		//step 1: convert to char array
		char[] ch = s.toCharArray();
		
		//step2: get only unique char using set
		HashSet<Character> set=new HashSet<Character>();
		
		for(int i=0; i<ch.length; i++)
		{
			set.add(ch[i]);
		}
		
		System.out.println(set);// output with unique chr
		
		//step3: comparing each chr of set with all chr of char-array
		 int count1=0;
		for(Character character:set) {//loop for set
			int count=0;
			
			for(int i=0; i<ch.length; i++) { 
				//loop for char-array
				if(character==ch[i])
				{
					count++;
				}
				}
			//print duplicated char and no of count 
			//after comparing with char-array, before starting new comparision
			
			if(count>1) {	
			count1++;
				}
			}
		System.out.println("num of duplicates present in given string "+count1);
	}
}



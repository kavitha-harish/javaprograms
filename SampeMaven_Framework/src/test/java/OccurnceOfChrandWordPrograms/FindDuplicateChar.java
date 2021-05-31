
package OccurnceOfChrandWordPrograms;

import java.util.HashSet;

public class FindDuplicateChar {

	public static void main(String[] args) {
		String s="robot";
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
		for(Character character:set) {//loop for set
			int count=0;
			for(int i=0; i<ch.length; i++) { 
				if(character==ch[i])//loop for char-array
				{
					count++;
				}
				
				}
			//print duplicated char and no of count 
			//after comparing with char-array, before starting new comparision
			
			if(count>1) {
			System.out.println(character + " "+ count);
				
				}
			}
	}

}

package OccurnceOfChrandWordPrograms;

import java.util.HashSet;

public class FindNumOfDupWordCount {
	public static void main(String[] args) {
		String s="welcome to india welcome to bangalore";
		//step 1: convert to char array
			String[] str = s.split(" ");
		
		//step2: get only unique char using set
		
		HashSet<String> set=new HashSet<String>();
		for(int i=0; i<str.length; i++)
		{
			set.add(str[i]);
		}
		System.out.println(set);// output with unique chr
		
		//step3: comparing each chr of set with all chr of char-array
		 int count1=0;
		for(String str1:set) {//loop for set
			
			int count=0;
			
			for(int i=0; i<str.length; i++) { 
				//loop for char-array
				if(str1.equals(str[i]))
				{
					count++;
				}
				}
			
			//print char and count after comparing with char-array, before starting new comparision	
		if(count>1) {
			
			count1++;
			}
		}
		System.out.println( count1);
	}
	}



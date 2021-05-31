package ArrayPrograms;

public class FindSmallestString {

	public static void main(String[] args) {
		String str[]= { "vinu","cat","mat"};
		
		String min = str[0];
		for(int i=1; i<str.length;i++) {
			if(min.length()>=str[i].length())
			{
				if(min.length()==str[i].length()) 
				{
					System.out.println(min);
				}
				min=str[i];
			
			}
			
		}
		System.out.println(min);
	}

}

package ArrayPrograms;

public class FindLargestString {

	public static void main(String[] args) {
		
		String[] str= {"vina", "visnu","mahi"};
		
		String max = str[0];
		for(int i=1; i<str.length; i++) {
			if(max.length()<=str[i].length()) {
				if(max.length()==str[i].length()) {
					System.out.println(max);
				}
				max=str[i];
			}
		}
		
		System.out.println(max);
	}

}

//reverse the word without variable

package ReversePrograms;

public class reversewordmethod1 {

	public static void main(String[] args) {
		
		String s="welcome to India";
		String[] str = s.split(" ");
		
		for(int i=str.length-1; i>=0; i--)
		{
			System.out.print(str[i]+" ");
		}

	}

}

package ReversePrograms;

public class reverseStringMethod3 {

	public static void main(String[] args) {
		String str="cat";
		String rev="";
		System.out.println("before reverse "+str);
		
		for(int i=0; i<str.length(); i++)
		{
			rev=str.charAt(i)+rev;
		}
		System.out.println(rev);

	}
}

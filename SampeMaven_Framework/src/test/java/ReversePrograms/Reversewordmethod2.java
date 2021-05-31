//reverse word with variable
package ReversePrograms;

public class Reversewordmethod2 {

	public static void main(String[] args) {
		String s="welcome to India";
		System.out.println("before reverse   "+ s);
		String[] str = s.split(" ");
		 String rev="";
		 
		 for(int i=0; i<str.length; i++)
		 {
			 rev=str[i]+" "+rev;
		 }
		 System.out.println("after reverse   "+rev);
	}
}

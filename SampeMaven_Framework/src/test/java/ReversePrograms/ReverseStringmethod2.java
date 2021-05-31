package ReversePrograms;

public class ReverseStringmethod2 {

	public static void main(String[] args) {
		
	String str="cat";
	System.out.println("before reverse "+str);
		
	for(int i=str.length()-1; i>=0; i--)
	{
	//System.out.println(str.charAt(i));
	//each char printed in diff line
	
	System.out.print(str.charAt(i)); //printed in same line
	}

	}
}

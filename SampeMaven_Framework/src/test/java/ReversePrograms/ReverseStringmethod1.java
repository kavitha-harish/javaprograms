package ReversePrograms;

public class ReverseStringmethod1 {

	public static void main(String[] args) {
		String str="cat";
		System.out.println("before reverse "+str);
		char[] ch=str.toCharArray();
		String rev="";//temp variable with empty value
		
		for(int i=ch.length-1; i>=0; i--)
		{
			rev=rev+ch[i];
		}
		
		System.out.println("string after reverse "+rev);

	}
	}



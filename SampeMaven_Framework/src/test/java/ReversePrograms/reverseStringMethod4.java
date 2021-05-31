package ReversePrograms;

public class reverseStringMethod4 {

	public static void main(String[] args) {
		String str="cat";
		System.out.println("before reverse "+str);
		char[] ch=str.toCharArray();
		String rev="";//temp variable with empty value
		
		for(int i=0; i<ch.length; i++)
		{
			rev=ch[i]+rev;
		}
		/*
		 * rev=ch[0]+rev=c+0=c,
		 * ch[1]+rev=a+c=ac
		 * ch[2]+rev=t+ac=tac
		 */
		System.out.println("string after reverse "+rev);
	}
}

package SwappingPrograms;

public class swapingtwoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="hello";
		String b="world";
		System.out.println("before swapping "+ a +b);//helloworld
		
		a=a+b;//helloword length is 10
		
		/*
		 * h e l l o w o r l d
		 * 0 1 2 3 4 5 6 7 8 9
		 */
		
		b=a.substring(0,a.length()-b.length());//0,10-5=0,5 hello 
		System.out.println("value of b is"+b);
		
		a=a.substring(b.length());//starts from 5 th index
		System.out.println("value of a is "+a);
		
		System.out.println("after swapping = " + a +" "+b);	
	}
}

package SwappingPrograms;

public class swapwithoutthirdvariable {

	public static void main(String[] args) {
		int a=10,b=20;
		System.out.println("before swap "+a + "  "+b);
		a=a+b;//30
		b=a-b;//30-20=10
		a=a-b;//30-10=20
		System.out.println("after swap, value of b is " +a);//10
		System.out.println("after swap, value of a is "+b);//20			
	
	}
}

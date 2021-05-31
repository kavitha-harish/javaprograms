package SwappingPrograms;

public class swapwiththirdvariable {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		System.out.println("before swapping value of a and b " +a +" "+b);
		int temp;
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("after swapping value of a is "+a);//20
		System.out.println("after swapping value of b is "+ b);//10
		
	}

}

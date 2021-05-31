//reverse the num +comare with given number if it is same then it is polindrome number
package JavaPrograms;

import java.util.Scanner;

public class Polidrome {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number ");
		int num = sc.nextInt();
		int temp=num;
		int rev=0,rem;
		
	while(num!=0) {
		rem=num%10;
		rev=rev*10+rem;
		num=num/10;
	}
	System.out.println(rev);
	
	if(rev==temp) {
		System.out.println("given num is polindrome");
	}
	else
	{
		System.out.println("given num is not polindrome");
	}
	}

}

package JavaPrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr number");
		int num = sc.nextInt();
		int temp=0;
		for(int i=2; i<=num-1; i++) {
			if(num % i==0) {
				temp=temp+1;
			}
			}
		//after for loop
			
			if (temp>1) {
				System.out.println("not primenumber");
			}
			else {
				System.out.println("prime number");
			}
		}

	}



/*armstromgnumbers
 * 153
 * 1*1*1=1
 * 5*5*5=125
 * 3*3*3=27
 * 1+125+27=153
 * ex 370,371 also armstrong num
 */
package JavaPrograms;

public class ArmStrongnumber {
	

	public static void main(String[] args) {
		
		int cube=0;
		int rem;
		int num=153;
		int temp=num;
		
		while(num>0) {
			rem=num%10;
			cube=cube+(rem*rem*rem);
			num=num/10;
		}
		
		if(temp==cube) {
			System.out.println("this is armstrong number");
		}
		else {
			System.out.println("this is not armstrong num");
		}

	}

}

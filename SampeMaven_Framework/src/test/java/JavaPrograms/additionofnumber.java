package JavaPrograms;

public class additionofnumber {

	public static void main(String[] args) {
	 int num=4875;
	 
	int sum=0;
	while(num!=0) {
		int rem = num%10;
		sum=sum+rem;
		num=num/10;
		}
	 System.out.println(sum);//4+8+7+9=24

	}

}

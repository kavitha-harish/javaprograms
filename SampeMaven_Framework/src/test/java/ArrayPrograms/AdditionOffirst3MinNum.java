package ArrayPrograms;

public class AdditionOffirst3MinNum {

	public static void main(String[] args) {
		int ary[]= {30,20,50,10,40};
		
		for(int i=0; i<ary.length; i++) {
			
			for(int j=i+1; j<ary.length; j++) {
				
				if(ary[i]>ary[j])
				{
					int temp=ary[i];
					ary[i]=ary[j];
					ary[j]=temp;
				}	
			}
		}
		int sum=0;
		for(int i=0; i<3; i++) {
			sum=sum+ary[i];
		}
		System.out.println(sum);
	}
}

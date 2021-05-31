package ArrayPrograms;

public class FindMaxNumberMinNumber {

	public static void main(String[] args) {
		int ary[]= {30,20,50,10,40};
		
		for(int i=0; i<ary.length; i++) {
			
			for(int j=i+1; j<ary.length; j++) {
				
				if(ary[i]<ary[j])
				{
					int temp=ary[i];
					ary[i]=ary[j];
					ary[j]=temp;
				}
			}
		}

	System.out.println("max number is  "+ary[0]);	//max number
	System.out.println("min number is  "+ary[ary.length-1]);//min number
	}
	}



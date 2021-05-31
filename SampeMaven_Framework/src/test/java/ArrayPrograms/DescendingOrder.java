package ArrayPrograms;

public class DescendingOrder {

	public static void main(String[] args) {
		int ary[]= {30,20,10,40,50};
		
	for(int i=0; i<ary.length; i++) {
		
		for(int j=i+1; j<ary.length; j++) {
			
			if(ary[i]>ary[j]) {
				int temp=ary[i];
				ary[i]=ary[j];
				ary[j]=temp;
			}
		}
	}
		for(int i=0; i<ary.length; i++) {
			
			System.out.println(ary[i]);
		}

	}

}

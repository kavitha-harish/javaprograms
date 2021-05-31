package ArrayPrograms;

public class AdditionOfTwoArray {

	public static void main(String[] args) {
		int a[]= {1,3,5};
		int b[]= {4,5,8,9};
		
		int size=a.length;
		if(size<b.length) {
			size=b.length;
		}
		
		for(int i=0; i<size; i++) {
			
			try {
				System.out.println(a[i]+b[i]);
			}
			
			catch(Exception e) {
				try{
					System.out.println(a[i]);
				}
				catch(Exception e1) {
					
				}
					System.out.println(b[i]);
					
				}
				
			}
		}
		

	}



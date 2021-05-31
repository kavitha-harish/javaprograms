package JavaPrograms;

public class alphabet2 {

	public static void main(String[] args) {
		int row=5,count=5;
		
		for(int i=1; i<=row; i++) {
			char ch = 'a';
			for(int j=1; j<=count; j++) {
				System.out.print(ch+" ");
				ch++;
			}
			
			System.out.println( );
		}

	}
}

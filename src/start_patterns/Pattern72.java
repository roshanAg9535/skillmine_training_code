package start_patterns;

public class Pattern72 {

	public static void main(String[] args) {
		int num= 1;
		for(int i=5; i>=1; i--) {
			int a = num ;
			for(int j =1; j<=5; j++) {
				if(j<=i) {
				System.out.print(a+" ");
				a++;
			}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}

	}

}

package start_patterns;

public class Pattern73 {

	public static void main(String[] args) {
		int a= 5;
		for(int i=5; i>=1; i--) {
			for(int j =1; j<=5; j++) {
				if(j<=i) {
				System.out.print(a+" ");
			}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			a--;
			
		}

	}

}

package start_patterns;

public class Pattern81 {

	public static void main(String[] args) {
		for(int i=5; i>=1; i--) {
			int a = 1; int b = 0;
			for(int j =1; j<=i; j++) {
				if(i%2==0) {
				System.out.print(b+" ");
			}
				else {
					System.out.print(a+" ");
				}
			}
			System.out.println();
		}
	}

}

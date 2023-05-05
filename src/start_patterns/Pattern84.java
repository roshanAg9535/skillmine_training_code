package start_patterns;

public class Pattern84 {

	public static void main(String[] args) {
		int num = 0; int num1 = 1;
		for(int i=5; i>=1; i--) {
			int a = 1; int b = 0;
			for(int j =1; j<=i; j++) {
				if(j%2==0) {
				System.out.print(a+" ");
			}
				else {
					System.out.print(b+" ");
				}
			}
			System.out.println();
		}
	}

}

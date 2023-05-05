package start_patterns;

public class Pattern43 {

	public static void main(String[] args) {
		int a=1;
		for(int i=1; i<=5; i++) {
			int b =a;
			for(int j =1; j<=i; j++) {
				System.out.print(b+" ");
				b=b+2;
			}
			System.out.println();
			a=a+2;
		}

	}

}

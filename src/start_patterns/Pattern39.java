package start_patterns;

public class Pattern39 {

	public static void main(String[] args) {
		int a =5;
		for(int i=1; i<=5; i++) {
			int b = a;
			for(int j =1; j<=i; j++) {
				System.out.print(b+" ");
				b++;
			}
			System.out.println();
			a--;
		}

	}

}

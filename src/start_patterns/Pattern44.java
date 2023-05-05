package start_patterns;

public class Pattern44 {

	public static void main(String[] args) {
		int a=1; int c = -1;
		for(int i=1; i<=4; i++) {
			int b =a;
			for(int j =1; j<=i; j++) {
				System.out.print(b+" ");
				b--;
			}
			System.out.println();
			c=c+1;
			a=a+2+c;
		}

	}

}

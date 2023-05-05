package start_patterns;

public class Pattern31 {

	public static void main(String[] args) {
		int a=65;
		for(int i=1; i<=5; i++) {
			int b= a;
			for(int j =1; j<=5; j++) {
				System.out.print((char)b+" ");
				b++;
			}
			System.out.println();
			a++;
		}

	}

}

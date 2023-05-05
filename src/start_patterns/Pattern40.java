package start_patterns;

public class Pattern40 {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			int a=2;
			for(int j =1; j<=i; j++) {
				System.out.print(a+" ");
				a=a+2;
			}
			System.out.println();
			a--;
		}

	}

}

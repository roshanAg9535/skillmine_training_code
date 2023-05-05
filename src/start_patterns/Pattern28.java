package start_patterns;

public class Pattern28 {

	public static void main(String[] args) {
		int a=69;
		for(int i=1; i<=5; i++) {
			for(int j =1; j<=5; j++) {
				System.out.print((char)a+" ");
			}
			System.out.println();
			a--;
		}

	}

}

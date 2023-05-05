package start_patterns;

public class Pattern67 {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			int a=69;
			for(int j =1; j<=5; j++) {
				if(j<=i) {
				System.out.print((char)a+" ");
				a--;}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}

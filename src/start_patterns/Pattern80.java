package start_patterns;

public class Pattern80 {

	public static void main(String[] args) {
		int num = 5 ; int num1 = 4;
		for(int i=5; i>=1; i--) {
			int a = num ; int c = num1;
			for(int j =1; j<=5; j++) {
				if(j<=i) {
				System.out.print(a+" ");
				a= a+c;c--;
			}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			num--;
			
		}

	}

}

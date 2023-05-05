package start_patterns;

public class Pattern79 {

	public static void main(String[] args) {
		int num= 17 ; int c = 3;
		for(int i=4; i>=1; i--) {
			int a = num ;
			for(int j =1; j<=4; j++) {
				if(j<=i) {
				System.out.print(a+" ");
				a++;
			}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();	
			num = num -c;
			c--;
		}

	}

}

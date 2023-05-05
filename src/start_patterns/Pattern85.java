package start_patterns;

public class Pattern85 {

	public static void main(String[] args) {
		int num = 0;
		for(int i=5; i>=1; i--) {
			int a = num; 
			for(int j =1; j<=i; j++) {
				System.out.print(a);
				
			}
			System.out.println();
		}
	}

}

package start_patterns;

public class Pattern14 {

	public static void main(String[] args) {
		int num = 6;
		for(int i=1; i<=5; i++) {
			num = num -1; int a = num;
			for(int j =1; j<=5; j++) {
				System.out.print(a+" ");
				a = a+5;
			}
			System.out.println();
		}
	}

}

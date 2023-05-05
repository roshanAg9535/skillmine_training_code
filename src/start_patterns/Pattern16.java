package start_patterns;

public class Pattern16 {

	public static void main(String[] args) {
		int num = 1;
		for(int i=1; i<=5; i++) {
			 int a = num;
			for(int j =1; j<=5; j++) {
				System.out.print(a+" ");
				a=a+1;
			}
			System.out.println();
			num++;
		}

	}

}

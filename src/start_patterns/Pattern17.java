package start_patterns;

public class Pattern17 {

	public static void main(String[] args) {
		int num = 1;
		for(int i=1; i<=5; i++) {
			 int a = num;
			for(int j =1; j<=5; j++) {
				System.out.print(a+" ");
				a=a+2;
			}
			System.out.println();
			num=num+2;
		}

	}

}

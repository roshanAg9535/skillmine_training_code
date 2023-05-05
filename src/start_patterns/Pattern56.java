package start_patterns;

public class Pattern56 {

	public static void main(String[] args) {
		int num = 1; int num1 = 4;
		for(int i=1; i<=5; i++) {
			int a = num ; int b = num1;
			for(int j =1; j<=i; j++) {
				System.out.print(a+" ");
				a=a+b;b--;
			}
			System.out.println();
			num++;
		}

	}

}

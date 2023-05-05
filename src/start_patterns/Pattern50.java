package start_patterns;

public class Pattern50 {

	public static void main(String[] args) {
		int num = 5; int num1 = 3;
		for(int i=1; i<=5; i++) {
			int a = num ; int b = num1;
			for(int j =1; j<=i; j++) {
				if(j%2==0)
				{
					System.out.print(b);
					b++;
				}
				else {
					System.out.print(a);
					a++;
				}
			}
			System.out.println();
			num ++; num1 ++;
		}

	}

}

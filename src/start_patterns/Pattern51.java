package start_patterns;

public class Pattern51 {

	public static void main(String[] args) {
		int num = 5; int num1 = 0;int c = 4;
		for(int i=1; i<=5; i++) {
			int a = num; int b = num1; 
			for(int j =1; j<=i; j++) {
				if(j%2==0)
				{
					System.out.print(b+" ");
					b = b+c;c--;
				}
				else {
					System.out.print(a+" ");
					a=a+c;c--;
				}
			}
			System.out.println();
			num++; num1++;
		}

	}

}

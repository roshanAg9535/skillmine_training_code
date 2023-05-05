package start_patterns;

public class Pattern57 {

	public static void main(String[] args) {
		int num = 1; int num1 = 1;int num2=0;
		for(int i=1; i<=5; i++) {
			for(int j =1; j<=i; j++) {
				System.out.print(num+" ");
				num2 =num+num1;
                num = num1;
                num1=num2;	
			}
			System.out.println();
		}

	}

}

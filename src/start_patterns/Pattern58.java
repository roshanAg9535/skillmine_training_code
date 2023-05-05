package start_patterns;

public class Pattern58 {

	public static void main(String[] args) {
		int num = 0 ; int num1 = 1;int num2=0;
		for(int i=1; i<=5; i++) {
			num2 =num+num1;
            num = num1;
            num1=num2;
			for(int j =1; j<=i; j++) {
				System.out.print(num);
			
			}
			System.out.println();
			
		}

	}

}

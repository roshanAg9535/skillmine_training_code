package start_patterns;

public class Pattern15 {

	public static void main(String[] args) {
		int num = 5; int num1 = 6;
		for(int i=1; i<=5; i++) {
			int a = num;int b = num1;;
			for(int j =1; j<=5; j++) {
				if(!(j%2==0))
				{
					System.out.print(a+" ");
					a=a+10;
				}
				else {
					System.out.print(b+" ");
					b=b+10;
				}
			}
			System.out.println();
			num--;num1++;
		}

	}

}

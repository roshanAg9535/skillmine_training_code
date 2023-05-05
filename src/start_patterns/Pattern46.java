package start_patterns;

public class Pattern46 {

	public static void main(String[] args) {
		int num = 2; int num1 = 0;
		for(int i=1; i<=5; i++) {
			int a= num ; int b = num1;
			for(int j =1; j<=5; j++) {
				if(j<=i)
				{
					System.out.print(a+b+" ");
					a++;b++;
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			num=num+i;num1=num1+i;
		}

	}

}

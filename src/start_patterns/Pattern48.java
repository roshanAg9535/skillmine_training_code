package start_patterns;

public class Pattern48 {

	public static void main(String[] args) {
		int num = 1; int num1 = 6; 
		for(int i=1; i<=5; i++) {
			int a= num ; int b = num1;int c = 0;
			for(int j =1; j<=5; j++) {
				if(j<=i)
				{
					System.out.print(a-c+" ");
					b--;c=c+b;b=b+2;
					
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			num1--;num=num+num1;
		}

	}

}

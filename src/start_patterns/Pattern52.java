package start_patterns;

public class Pattern52 {

	public static void main(String[] args) {
		int num = 5;int c = 6;int d = 4;
		for(int i=5; i>=1; i--) {
			int a = num ;
			for(int j =5; j>=5; j--) {
				if(j==i)
				{
					System.out.print(i);
				}
				else if(j<i)
				{
					System.out.print(a);
					 a = a-c;c--;
					
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			num = num+d; c--;
		}

	}

}

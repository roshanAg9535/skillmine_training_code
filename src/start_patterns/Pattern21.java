package start_patterns;

public class Pattern21 {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			int a = 0; int b =1;
			if(i%2==0)
			{
				b--;
			}
			for(int j =1; j<=5; j++) {
				if(j%2==0)
				{
					System.out.print(b);
				}
				else {
					System.out.print(a);
				}
			}
			System.out.println();
		}

	}

}

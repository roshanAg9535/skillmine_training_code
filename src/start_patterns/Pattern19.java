package start_patterns;

public class Pattern19 {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			int a = 0; int b =1;
			if(i%2==0)
			{
				a++;b--;
			}
			for(int j =1; j<=5; j++) {
				if(j%2==0)
				{
					System.out.print(a);
				}
				else {
					System.out.print(b);
				}
			}
			System.out.println();
		}

	}

}

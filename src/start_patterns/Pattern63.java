package start_patterns;

public class Pattern63 {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			int a = 0;
			for(int j =1; j<=i; j++) {
				if(j==i)
				{
					System.out.print("0");
				}
				else if(j<i)
				{
					System.out.print(a);
				
				}
			}
			System.out.println();
			a++;a--;
			
	
		}

	}

}

package start_patterns;

public class Pattern23 {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			int a = 1;
			if(i%2==0)
			{
				a--;
			}
			for(int j =1; j<=5; j++) {
				
		    	System.out.print(a);
			}
			System.out.println();
		}

	}

}

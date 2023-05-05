package start_patterns;

public class Pattern49 {

	public static void main(String[] args) {
		int num = 3;
		for(int i=1; i<=5; i++) {
			int a = num ;
			if(i%2==0)
			{
				a=a+5;
			}
			else
			{
				a++;
			}
			
			for(int j =1; j<=i; j++) {
				if(j==i)
				{
					System.out.print(i);
				}
				else if(j<i)
				{
					System.out.print(a);
					int c = 0;a=a-c++;
					
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			num++;
		}

	}

}

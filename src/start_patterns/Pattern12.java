package start_patterns;

public class Pattern12 {

	public static void main(String[] args) {
		 int b =1; int num = 1;
		for(int i=1; i<=5; i++) {
			int a = num;
			for(int j =1; j<=5; j++) {
				if(j>1)
				{
					a=a+5;
					System.out.print(a+" ");
				}
				else
				{
					System.out.print(b+" ");
				}
			}
			
			System.out.println();
			b++;num++;
		}
		
		

	}

}

package start_patterns;

public class Pattern13 {

	public static void main(String[] args) {
		 int num = 0;
		for(int i=1; i<=5; i++) { 
			int a = num; int b = i;
			for(int j =1; j<=5; j++) {
				if(j%2==0)
				{
					a=a+10;
					System.out.print(a+" ");
				}
				else {
					System.out.print(b+" ");
					b=b+10;
				}
			}
			System.out.println();
			num--;
			
		}
		
		

	}

}

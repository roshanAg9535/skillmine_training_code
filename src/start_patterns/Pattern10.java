package start_patterns;

public class Pattern10 {

	public static void main(String[] args) {
		int num1 =1;
		for(int i=1; i<=5; i++) {
			int num =1; 
			for(int j =1; j<=6; j++) {
				
				if(j%2==0)
				{
					System.out.print(num1);
					
				}
				else {
					System.out.print(num);
					num++;
				}
			}
			System.out.println();
			num1++;
		}

	}

}

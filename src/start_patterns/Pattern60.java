package start_patterns;

public class Pattern60 {

	public static void main(String[] args) {
		for(int i=1; i<=6; i++) {
			int a = 0; int b = 1;
			for(int j =1; j<=i; j++) {
				if(i%2==0)
				{
					System.out.print(b+" ");
				}
				else {
					System.out.print(a+" ");
				}
			}
			System.out.println();
		}

	}

}

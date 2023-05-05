package programs.section;

public class Pattern5 {
	public static void main(String[] args) {
		int n = 5;
		for(int i = 1;i<=n;i++)
		{
			int k =1;
			for(int j= 1;j<=n-i+1;j++)
			{
				
				System.out.print(" ");
				
			}
			if(k>=1)
			{
				for(int l=1;l<=i ;l++)
				{
					System.out.print("*");
				}
				k++;
			}
			
			System.out.println();
			
		}
	}

}

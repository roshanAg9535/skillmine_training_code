package programs.section;

public class Pattern6 {
	public static void main(String[] args) {
		int n =5;
		for(int i =0; i<=n;i++)
		{
			int l =1;
			for(int j =1;j<=n-i;j++)
			{
				System.out.print("*");
			}
			if(l>=1)
			{
				for(int m =1;m<=i+1;m++)
				{
					System.out.print(" ");
				}
			}
			System.out.println(  );
		}
	}

}

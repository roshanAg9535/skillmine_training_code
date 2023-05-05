package programs.section;

public class Pattern4 {
	public static void main(String[] args) {
		int n = 9;
		for(int i = 1;i<=n;i++)
		{
			for(int j = 1; j<=i;j++)
			{
				if(i>5&&j<=i)
				{
					for(int k=9;k>=i;k--)
					{
						System.out.print("*");
					}
					break;
				}
				else
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

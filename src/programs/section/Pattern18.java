package programs.section;

public class Pattern18 {
	public static void main(String[] args) {
		
		for(int i =5;i>=1;i--)
		{ 
			boolean num = true;
			for(int j=9;j>=1;j--)
			{
				if(j>=6-i&&j<=4+i&&num)
				{
					System.out.print("*");
					num = false;
				}
				else
				{
					System.out.print(" ");
					num = true;
				}
			}
			System.out.println();
			

	}
		for(int i =1;i<=5;i++)
		{ 
			boolean num = true;
			for(int j=1;j<=9;j++)
			{
				if(j>=6-i&&j<=4+i&&num)
				{
					System.out.print("*");
					num = false;
				}
				else
				{
					System.out.print(" ");
					num = true;
				}
			}
			System.out.println();
			
		}

	}
}

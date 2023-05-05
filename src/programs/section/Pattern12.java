package programs.section;

public class Pattern12 {
	public static void main(String[] args) {
		for(int i =1;i<=5;i++)
		{
			for(int j =1;j<=5;j++)
			{
				if(j<=i&&i<=4)
				{
					if(i==2&&j==2)
					{
						System.out.print("#");
						break;
					}
					System.out.print("*");
				}
				else if(i==5)
				{
					System.out.print(j);
				}
				 if(i==4&&j==1)
				{
					System.out.print("$");
				}
				 if(i==4&&j==4)
				{
					System.out.print("?");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();

	
		}
}
}

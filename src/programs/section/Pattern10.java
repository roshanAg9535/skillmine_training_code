package programs.section;

public class Pattern10 {
	public static void main(String[] args) {
		for(int i =1;i<=4;i++)
		{
			boolean toprint = true;
			for(int j =1;j<=7;j++)
			{
				if(j>=i&&j<=8-i&& toprint)
				{
					System.out.print("*");
					toprint = false;
				}
				else
				{
					System.out.print(" ");
					toprint = true;
				}
				
			}
			System.out.println();
		}
	}

}

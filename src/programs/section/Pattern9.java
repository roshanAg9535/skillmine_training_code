package programs.section;

public class Pattern9 {
	public static void main(String[] args) {
		for(int i =1;i<=5;i++)
		{
			int num=6;
			for(int j =1;j<=9;j++)
			{
			
				if(j<=5)
				{
					num--;
				}
				else
				{
					num++;
				}
				if(j>=6-i&&j<=4+i)
				{
					System.out.print(num);
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

package programs.section;

public class Pattern15 {
	public static void main(String[] args) {
		for(int i =5;i>=1;i--)
		{ 
			for(int j=9;j>=1;j--)
			{
				if(j<=5-i||j>=5+i)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			
			
			}
			System.out.println();	
			
		}
	}

}

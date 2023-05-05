package loop;

public class Forcontinue {
	public static void main(String[] args) {
		for(int i =1;i<=10;i++)
		{
			if(i==5)
			{
				continue;
			}
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i =1;i<=10;i++)
		{
			if(i>=3&&i<=7)
			{
				continue;
			}
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i =1;i<=10;i++)
		{
			if(i==3||i==6||i==9)
			{
				continue;
			}
			System.out.print(i+" ");
		}
	}
	}
	
	



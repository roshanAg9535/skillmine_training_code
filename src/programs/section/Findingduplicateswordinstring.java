package programs.section;

import java.util.Scanner;

public class Findingduplicateswordinstring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string value");
		String s = sc.nextLine();
		String s1[]=s.split(" ");
		for(int i =0;i<s1.length;i++)
		{
			for(int j=i+1;j<s1.length;j++)
			{
				if(s1[i].equals(s1[j]))
				{
					System.out.println("The duplicate words are :"+s1[j]);
				}
			}
		}
		
	}

}

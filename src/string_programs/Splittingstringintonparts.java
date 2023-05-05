package string_programs;

import java.util.Scanner;

public class Splittingstringintonparts {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word");
		String s = sc.next();
		int len = s.length();
		System.out.println("Enter the number of splits required");
		int n= sc.nextInt();
		int tl = len/n;
		if(len%n==0)
		{
			for(int i=0;i<n;i++)
			{
				String ew = "";
				for(int j=tl*i;j<(i+1)*tl;j++)
				{
					ew = ew+s.charAt(j);
				}
				System.out.println(ew);
			}
		}
		else
			System.out.println("The split is not possible");
	}

}

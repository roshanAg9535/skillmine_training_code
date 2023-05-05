package client_practice;

import java.util.Scanner;

public class Findingduplicatewordsinastring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  anything");
		String s = sc.nextLine();
		String s1[] = s.split(" ");
		System.out.println("Duplicate words are");
		for(int i=0;i<s1.length;i++)
		{
			for(int j=i+1;j<s1.length;j++)
			{
				if(s1[i].equals(s1[j])&&s1[i]!="")
				{
					s1[j]="";
              }
			}
			if(s1[i]!="")
			{
				System.out.print(s1[i]+"\n");
			}
		}
	}

}

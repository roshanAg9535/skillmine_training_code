package programs.section;

import java.util.Scanner;

public class Occurenceoftheletter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.next();
		int count =0;
		System.out.println("Enter the word which we want to check");
		char ch = sc.next().charAt(0);
		for(int i =0;i<s.length();i++)
		{
			if(ch==s.charAt(i))
			{
				count++;
			}
		}
		System.out.println("The number of times the word "+ch+" "+" repeated is"+" "+count);
	}
}
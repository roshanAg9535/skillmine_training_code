package string_programs;

import java.util.Scanner;

public class Counttotalpucationinthestring {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the value");
		String s = sc.nextLine();
		char a[] = s.toCharArray();
		int count =0;
		for(int i =0; i<a.length;i++)
		{
			if(a[i]==','||a[i]=='!'||a[i]=='.')
			{
				count++;
			}
		}
		System.out.println("The number of puncation in the string is "+count);
	}

}

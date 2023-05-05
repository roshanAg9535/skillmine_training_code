package string_programs;

import java.util.Scanner;

public class Printingstringinforwardandreversedirection {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		String s = sc.nextLine();
		for(int i =0;i<s.length();i++)
		{
			System.out.print(s.charAt(i));
		}
		System.out.println();
		for(int i = s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
	}

}

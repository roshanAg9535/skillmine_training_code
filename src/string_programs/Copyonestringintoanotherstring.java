package string_programs;

import java.util.Scanner;

public class Copyonestringintoanotherstring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		String s = sc.nextLine();
		String r = "";
		for(int i =0;i<s.length();i++)
		{
		  r= r+s.charAt(i);
		}
		System.out.print(r);
	}

}

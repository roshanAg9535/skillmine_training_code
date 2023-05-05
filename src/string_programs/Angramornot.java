package string_programs;

import java.util.Arrays;
import java.util.Scanner;

public class Angramornot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first value");
		String a = sc.nextLine();
		System.out.println("Enter the second value");
		String b = sc.nextLine();
		char c[] = a.toLowerCase().toCharArray();
		char d[] = b.toLowerCase().toCharArray();
		Arrays.sort(c);
		Arrays.sort(d);
		boolean result = Arrays.equals(c, d);
		if(result==true)
		{
			System.out.println("it is a angram ");
		}
		else
		{
			System.out.println("it is not a angram");
		}
	}

}

package string_programs;

import java.util.Scanner;

public class Countingnumberofwordsinstring {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the value");
		String s = sc.nextLine();
		String a[] = s.split(" ");
		int count = 0;
		for(int i = 0 ; i<a.length;i++)
		{
			count++;
		}
		System.out.println("The number of words in the string is : "+count);
	}

}

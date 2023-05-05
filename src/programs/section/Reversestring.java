package programs.section;

import java.util.Scanner;

public class Reversestring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the object that needed to be reverse");
		String s = sc.nextLine();
		String rev="";
		for(int i =s.length()-1;i>=0;i--)
		{
			rev = rev+s.charAt(i);
		}
		System.out.println("The reverse of the object is : "+rev);
	}
}
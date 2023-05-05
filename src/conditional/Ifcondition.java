package conditional;

import java.util.Scanner;

public class Ifcondition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String s = sc.next();
		if(s.equals("Roshan"))
		{
			System.out.println("Access granted");
			
		}
		else
		{
			System.out.println("Access denied");
		}
	}

}

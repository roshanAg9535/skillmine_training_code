package conditional;

import java.util.Scanner;

public class switchcase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String s = sc.next();
		switch (s)
		{
		case "Roshan" :
		{
			System.out.println("Access Granted");
			break;
		}
		case "suresh" :
		{
			System.out.println("Access Granted");
			break;
		}
		case "Dipu" :
		{
			System.out.println("Access Granted");
			break;
		}
		default :
		{
			System.out.println("Access Denied");
		}
		
		}
		}

}

package practice;

import java.util.Scanner;

public class Wajptofindthevalueofonenumberraisedtothepowerofanother {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int f1 = sc.nextInt();
		System.out.println("Enter the second number");
		int f2 =sc.nextInt();
		int f3 =1;
		for(int i =1;i<=f2;i++)
		{
			
			 f3=f3*f1;
		}
		System.out.println(f3);
	}

}

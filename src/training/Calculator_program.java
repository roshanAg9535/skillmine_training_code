package training;

import java.util.Scanner;

public class Calculator_program {
	public static void add(double  n1,double n2)
	{
		 double result = n1+n2;
		 System.out.println(result);
		 
	}
	public static void sub(double n1 , double n2)
	{
		 double result = n1-n2;
		 System.out.println(result);
		 
	}
	public static void mul(double n1,double n2)
	{
		 double result = n1*n2;
		 System.out.println(result);
		 
	}
	public static void div(double n1, double n2)
	{
		 double result = n1%n2;
		 System.out.println(result);
		 
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int n1 = sc.nextInt();
		System.out.println("Enter the second number");
		int n2 = sc.nextInt();
		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1 :
		{
			add(n1,n2);
			break;
		}
		case 2 :
		{
			sub(n1,n2);
			break;
		}
		case 3 :
		{
			mul(n1,n2);
			break;
		}
		case 4 :
		{
			div(n1,n2);
			break;
		}
		default :
		{
			System.out.println("Out of choice");
		}
		
		
		
		}
	}

}

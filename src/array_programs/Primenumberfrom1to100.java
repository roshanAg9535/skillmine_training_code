package array_programs;

import java.util.Scanner;

public class Primenumberfrom1to100 {
	public static int primeornot(int num)
	{
		boolean res =true; int finalres =0;
		for(int i = 2;i<=num-1;i++)
		{
			if(num%i==0)
			{
			  res = false;
			  break;
			}
		}
		if(res==true)
		{
			finalres =1;
		}
		return finalres;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting number");
		int start = sc.nextInt();
		System.out.println("Enter the end number");
		int end = sc.nextInt();
		int count =0;
		for(int i = start;i<=end;i++)
		{
			if(primeornot(i)==1)
			{
				System.out.print( i+" , ");
				count++;
			}
		}
		System.out.println();
		System.out.println("The number of prime number between "+start+"and "+end+" are "+count);
	}

}

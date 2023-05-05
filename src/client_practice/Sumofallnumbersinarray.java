package client_practice;

import java.util.Scanner;

public class Sumofallnumbersinarray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array elements you want");
		int n = sc.nextInt();
		System.out.println("Add the array element");
		int a[] = new int[n+1];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<a.length-1;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("The sum of all array digits are :- "+sum);
	}

}

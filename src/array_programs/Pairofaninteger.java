package array_programs;

import java.util.Scanner;

public class Pairofaninteger {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of size");
	int size = sc.nextInt();
	System.out.println("Enter all the array elements");
	int a[] = new int[size];
	for(int i = 0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	int sum = 0;
	for(int i =0;i<a.length;i++)
	{
	int num = sum;
		sum = sum+a[i];
		System.out.println("The revenue you aew");
	}
}
}

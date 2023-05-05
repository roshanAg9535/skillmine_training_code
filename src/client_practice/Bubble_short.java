package client_practice;

import java.util.Scanner;

public class Bubble_short {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of array elements you want");
		int n = sc.nextInt();
		System.out.println("Add array element ");
		int a[] = new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=1;i<a.length;i++)
		{
			for(int j=0;j<a.length-i;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp =a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("The sorted array elements are ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}

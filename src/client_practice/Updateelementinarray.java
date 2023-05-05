package client_practice;

import java.util.Scanner;

public class Updateelementinarray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array element you want ");
		int n = sc.nextInt();
		System.out.println("Add array element");
		int a[] = new int[n+1];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Array element before update ");
		for(int i=0;i<a.length-1;i++)
		{
			System.out.println(a[i]+" at index "+i);
		}
		System.out.println("insert the element you want to update");
		int element = sc.nextInt();
		System.out.println("At what index you want to update ");
		int index = sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(index==i)
			{
				a[i]=element;
			}
		}
		System.out.println("The array element after update");
		for(int i=0;i<a.length-1;i++)
		{
			System.out.println(a[i]+" at index "+i);
		}
	
	}

}

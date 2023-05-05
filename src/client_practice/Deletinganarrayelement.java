package client_practice;

import java.util.Scanner;

public class Deletinganarrayelement {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the array element you want");
	int n = sc.nextInt();
	System.out.println("Add array element ");
	int a[] = new int[n+1];
	for(int i=0 ; i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("The array element before deletion ");
	for(int i =0;i<a.length-1;i++)
	{
		System.out.println(a[i]+" at index "+i);
	}
	System.out.println("Enter the element you want to delete");
	int element = sc.nextInt();
	int index =0;
	boolean searchres=false;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==element)
		{
			index=i;
			searchres=true;
		}
	}
	System.out.println("The element "+element+" you want to delete is at index "+index);
	if(searchres=true)
	{
		for(int i=index;i<a.length-1;i++)
		{
			a[i]=a[i+1];
		}
		System.out.println("The array elements after deletion ");
		for(int i=0;i<a.length-1;i++)
		{
			System.out.println(a[i]+" at index "+i);
			
		}
	}
	
}
}

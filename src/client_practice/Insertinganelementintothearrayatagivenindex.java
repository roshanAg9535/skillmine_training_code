package client_practice;

import java.util.Scanner;

public class Insertinganelementintothearrayatagivenindex {

	public static void main(String[] args) {
		System.out.println("Enter number of element in the array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("enter the "+n+"elements in to the array");
		int a[] = new int[n+1];
		for(int i =0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("The array element before insertion are");
		for(int i = 0 ;i<n;i++)
		{
			System.out.println(a[i]+" at index "+i);
		}
		System.out.println("Enter the position where you want to insert ");
		int positioninsert = sc.nextInt();
		System.out.println("Enter the elment which you want to insert");
		int element = sc.nextInt();
		for(int i = a.length-1;i>=positioninsert;i--)
		{
			a[i]=a[i-1];
		}
		System.out.println("After shifting the array has become ");
		for(int i = 0 ; i<a.length;i++)
		{
			System.out.println(a[i]+" at index "+i);
		}
		System.out.println("inserting the value at the position"+positioninsert);
		for(int i =0;i<a.length;i++)
		{
			if(positioninsert==i)
			{
				a[positioninsert]=element;
			}
		}
		System.out.println("After inserting the new value in to the array is");
		for(int i =0;i<a.length;i++)
		{
			System.out.println(a[i]+" at index "+i);
		}

	}

}

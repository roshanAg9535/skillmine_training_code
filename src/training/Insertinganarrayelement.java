package training;

import java.util.Scanner;

public class Insertinganarrayelement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		System.out.println("Enter the array element");
		int a[] = new int[n+1];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the index at which you want to insert");
		int positiontoinsert = sc.nextInt();
		System.out.println("Enter the element you want to insert");
		int element = sc.nextInt();
		System.out.println("The element before inserting ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" "+i);
		}
		for(int i= a.length-1;i>=positiontoinsert;i--)
		{
			a[i]=a[i-1];
		}
		for(int i=0;i<a.length;i++)
		{
			if(i==positiontoinsert)
			{
				a[i]=element;
			}
		}
		System.out.println("Element after inserting");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	}

}

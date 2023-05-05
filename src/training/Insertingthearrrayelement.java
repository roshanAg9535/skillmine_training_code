package training;

import java.util.Scanner;

public class Insertingthearrrayelement {
	public static void main(String[] args) {
		System.out.println("Enter the number of array element you want");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("The element before the insertion are ");
		int a[] = new int[n+1];
		for(int i =0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i = 0;i<a.length-1;i++)
		{
			System.out.println(a[i]+" at index "+i);
		}
		System.out.println("Enter the position you want to insert");
		int positioninsert = sc.nextInt();
		System.out.println("Enter the element you want to insert");
		int element = sc.nextInt();
		for(int i = a.length-1;i>=positioninsert;i--)
		{
			a[i]=a[i-1];
		}
		System.out.println("Inserting the element "+element+" at the position "+positioninsert);
		for(int i=0;i<a.length;i++)
		{
			if(i==positioninsert)
			{
				a[positioninsert]=element;
			}
		}
		System.out.println(" Array element after insertion ");
		for(int i =0;i<a.length;i++)
		{
			System.out.println(a[i]+" at index "+i);
		}
	}

}

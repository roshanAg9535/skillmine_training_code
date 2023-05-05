package array_programs;

import java.util.Scanner;

public class Deletingtheelementinarray {
	public static void main(String[] args) {
		int a [] = {11,22,33,44,55};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the position which we want to delete");
		int pos = sc.nextInt();
		int b[] = new int[a.length-1];
		for(int i =pos-1;i<a.length-1;i++)
		{
			a[i]=a[i+1];
		}
		for(int i=0;i<b.length;i++)
		{
			b[i]=a[i];
		}
		for(int i =0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
	}

}

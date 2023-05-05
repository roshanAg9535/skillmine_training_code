package client_practice;

import java.util.Scanner;

public class Linear_search {
	public static void main(String[] args) {
		int a [] = {10,20,30,40,50,60,70};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element to search");
		int n = sc.nextInt();
		boolean search = false;
		int index =0;
		for(int i=0;i<a.length;i++)
		{
			if(n==a[i])
			{
				search = true;
				index =i;
			}
		}
		System.out.println("The search element "+n+" is at index  "+index);
		
	}

}

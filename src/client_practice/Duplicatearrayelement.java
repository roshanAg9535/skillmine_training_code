package client_practice;

import java.util.Scanner;

public class Duplicatearrayelement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		System.out.println("Enter the array element");
		int a[] = new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++)
		{ 
			int count =1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j]&&a[i]!=0) {
					a[j]=0;
				count++;
			}
				}
			if(count>1&&a[i]!=0)
			{
				System.out.println("The duplicate element is: "+a[i]+"number of times "+count);
			}
		}
	}

}

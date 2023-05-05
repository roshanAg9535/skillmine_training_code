package training;

import java.util.Scanner;

public class Findingduplicatearrayelement {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
	System.out.println("Enter the size of the array");
	int size = sc.nextInt();
	int a[] = new int [size];
	System.out.println("Enter the array element");
	for (int i = 0 ; i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	for(int i = 0;i<a.length;i++)
	{
		int count =1;
		for(int j =i+1;j<a.length;j++)
		{
			if(a[i]==a[j]&&a[i]!=0)
			{
				a[j]=0;
				count++;
			}
		}
		if(a[i]!=0&&count>1)
		{
			System.out.println("The duplicate element is "+a[i]+" number of times it is repeated "+count);
		}
	}
	}

}

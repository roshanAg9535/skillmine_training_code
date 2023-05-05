package array_programs;

import java.util.Scanner;

public class Smallestinarray {
public static void main(String[] args) {
	int a[] = {5,3,1,2,4,5};
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the nuber to check");
	int item = sc.nextInt();
	int count =0;
	for(int i = 0;i<a.length;i++)
	{
		if(item==a[i])
		{
			count++;
		}
	}
	System.out.println("the nmber "+ item +" "+ "number of times "+count);
}
}

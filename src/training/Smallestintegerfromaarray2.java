package training;

import java.util.Scanner;

public class Smallestintegerfromaarray2 {
	static int Small(int arr[]) {
		int small =arr[0];
		int index = 0;
		for(int i =1;i<arr.length;i++)
		{
			if(small>arr[i])
			{
				small =arr[i];
				index = i;
			}
		}
		return small;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("how many numbers you want to insert into the array");
		int totalnumbers = sc.nextInt();
		
		int a[] = new int[totalnumbers];
		
		System.out.println("Enter "+ totalnumbers + " numbers into the array.");
		
		for ( int i=0; i< totalnumbers; i++) {
		   a[i] = sc.nextInt();
		}
		
		System.out.println("The smallest integer in the array is : "+Small(a));
	}
}

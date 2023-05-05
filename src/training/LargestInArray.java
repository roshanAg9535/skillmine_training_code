package training;

import java.util.Scanner;

public class LargestInArray {
	static int max(int arr[]) {
		int largest =arr[0];
		int index = 0;
		for(int i =1;i<arr.length;i++)
		{
			if(largest  < arr[i])
			{
				largest =arr[i];
				index = i;
			}
		}
		return largest;
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
		
		System.out.println("The largest integer in the array is : "+max(a));
	}
}

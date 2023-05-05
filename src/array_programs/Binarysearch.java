package array_programs;

import java.util.Scanner;

public class Binarysearch {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		int result = 0;
		int index = 0; int start = 0; int end = a.length;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element you want to check ");
		int item = sc.nextInt();
		while(start<end)
		{
			int mid = (start+end)/2;
			if(item==a[mid])
			{
				result =1;
				index =mid;
				break;
			}
			else if(item<a[mid])
			{
				end=mid-1;
			}
			else
			{
				start =mid+1;
			}
		}
		if(result==1)
		{
			System.out.println("your item "+item+" is at index number "+index);
		}
		else
		{
			System.out.println("this item "+item +"is not present");
		}
	}

}

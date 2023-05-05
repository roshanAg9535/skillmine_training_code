package array_programs;

import java.util.Scanner;

public class Linearsearch {
	public static void main(String[] args) {
		int a[] = {11,12,13,14,15,16,17,18,19,20};
		int result = 0;
		int index = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element you want to check ");
		int item = sc.nextInt();
		for(int i =0;i<a.length;i++)
		{
			if(item==a[i])
			{
				result=1;
				index = 1;
				break;
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

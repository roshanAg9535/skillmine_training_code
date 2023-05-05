package sorting_techniques;

import java.util.Scanner;

public class BubbleSort {
	public static void bubble(int arr[])
	{
		for(int i =1;i<=arr.length;i++)
		{
			for(int j =0;j<arr.length-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
				
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the array element");
		for(int i = 0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("The sorted array elements are: ");
		bubble(arr);
	}

}
